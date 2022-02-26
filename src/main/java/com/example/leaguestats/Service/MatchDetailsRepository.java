package com.example.leaguestats.Service;

import com.example.leaguestats.Domain.*;
import com.example.leaguestats.RestClient.AccountDetails.AccountRestClient;
import com.example.leaguestats.RestClient.MatchDetails.MatchRestClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchDetailsRepository {

    private final AccountRestClient accountRestClient;
    private final MatchRestClient matchRestClient;

    public MatchDetailsRepository(AccountRestClient accountRestClient, MatchRestClient matchRestClient) {
        this.accountRestClient = accountRestClient;
        this.matchRestClient = matchRestClient;
    }

    private String getPuuid(String username) {
        SummonerDTO summonerDTO = accountRestClient.getPuuid(username);
        return summonerDTO.getPuuid();
    }

    public List<String> retrieveListOfMatches(String username) {
        String puuid = getPuuid(username);
        return matchRestClient.getMatchesByPuuid(puuid);
    }

    public FullMatchDTO retrieveAllMatchInformation(String matchId) {
        SingleMatchDTO singleMatchDTO = retrieveSingleMatchDetails(matchId);
        MatchTimelineDTO matchTimelineDTO = retrieveMatchTimelineDTO(matchId);

        return new FullMatchDTO(singleMatchDTO, matchTimelineDTO);
    }

    public List<String> retrieveFullMatchCsv(String matchId) throws JsonProcessingException {
        String matchIdWithTagline = "EUW1_" + matchId;
        FullMatchDTO fullMatchDTO = retrieveAllMatchInformation(matchIdWithTagline);

        return convertToCSV(fullMatchDTO);
    }

    private SingleMatchDTO retrieveSingleMatchDetails(String matchId) {
        return matchRestClient.retrieveSingleMatchDetails(matchId);
    }

    private MatchTimelineDTO retrieveMatchTimelineDTO(String matchId) {

        MatchTimelineDTO matchTimelineDTO = matchRestClient.retrieveMatchTimeline(matchId);

        FramesDTO frameToReturn = new FramesDTO(null, 0);

        for (FramesDTO framesDTO : matchTimelineDTO.getInfoTimelineDTO().getFramesDTO()) {

            String timestamp = String.valueOf(framesDTO.getTimestamp());

            if (timestamp.length() > 5) {
                if (timestamp.startsWith("900")) {
                    frameToReturn = framesDTO;
                }
            }
        }
        return new MatchTimelineDTO(
                new InfoTimelineDTO(
                        List.of(frameToReturn)
                )
        );
    }

    private List<String> convertToCSV(FullMatchDTO fullMatchDTO) throws JsonProcessingException {
        CsvMapper csvMapper = new CsvMapper();
        List<String> csvList = new ArrayList<>();

        //Single Match DTO
        List<GameParticipantsDTO> gameParticipantsDTOList = fullMatchDTO.getSingleMatchDTO().getInfoDTO().getParticipants();

        //Match Timeline DTO
        List<FramesDTO> framesDTOList = fullMatchDTO.getMatchTimelineDTO().getInfoTimelineDTO().getFramesDTO();
        List<FrameDetailsDTO> frameDetailsDTOArrayList = new ArrayList<>();

        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO1());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO2());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO3());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO4());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO5());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO6());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO7());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO8());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO9());
        frameDetailsDTOArrayList.add(framesDTOList.get(0).getParticipantFrames().getFrameDetailsDTO10());

        CsvSchema gameParticipantsSchema = csvMapper.schemaFor(GameParticipantsDTO.class).withHeader();
        csvList.add(csvMapper.writer(gameParticipantsSchema).writeValueAsString(gameParticipantsDTOList));

        CsvSchema damageStatsSchema = csvMapper.schemaFor(DamageStatsDTO.class).withHeader();

        CsvSchema frameDetailsSchema = csvMapper.schemaFor(FrameDetailsDTO.class).withHeader().withColumnsFrom(damageStatsSchema);
        csvList.add(csvMapper.writer(frameDetailsSchema).writeValueAsString(frameDetailsDTOArrayList));

        return csvList;
    }
}

package com.example.leaguestats.Service;

import com.example.leaguestats.Domain.DamageStatsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.jupiter.api.Test;

class MatchDetailsRepositoryTest {

    @Test
    public void convertJsonToCSV() throws JsonProcessingException {

        CsvMapper csvMapper = new CsvMapper();

        //first take out = and put :

        DamageStatsDTO damageStatsDTO = new DamageStatsDTO(
        0,
                0
        );

        CsvSchema schema = csvMapper.schemaFor(DamageStatsDTO.class).withHeader();
        String csv = csvMapper.writer(schema).writeValueAsString(damageStatsDTO);
        System.out.println(csv);
    }

}
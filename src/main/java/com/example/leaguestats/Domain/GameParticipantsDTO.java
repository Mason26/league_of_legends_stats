package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GameParticipantsDTO {

    private final long assists;
    private final long baronKills;
    private final String championName;
    private final long damageSelfMitigated;
    private final long deaths;
    private final long doubleKills;
    private final long dragonKills;
    private final boolean firstBloodAssist;
    private final boolean firstBloodKill;
    private final boolean firstTowerAssist;
    private final boolean firstTowerKill;
    private final long goldEarned;
    private final long inhibitorKills;
    private final long killingSprees;
    private final long kills;
    private final long largestCriticalStrike;
    private final long largestKillingSpree;
    private final long largestMultiKill;
    private final float longestTimeSpentLiving;
    private final long magicDamageDealtToChampions;
    private final long neutralMinionsKilled;
    private final long objectivesStolen;
    private final long pentaKills;
    private final long physicalDamageDealtToChampions;
    private final long quadraKills;
    private final String role;
    private final long spell1Casts;
    private final long spell2Casts;
    private final long spell3Casts;
    private final long spell4Casts;
    private final long summoner1Casts;
    private final long summoner1Id;
    private final long summoner2Casts;
    private final long summoner2Id;
    private final String summonerName;
    private final long timeCCingOthers;
    private final long totalDamageDealtToChampions;
    private final long totalDamageShieldedOnTeammates;
    private final long totalDamageTaken;
    private final long totalHealsOnTeammates;
    private final long totalMinionsKilled;
    private final float totalTimeSpentDead;
    private final long tripleKills;
    private final long trueDamageDealtToChampions;
    private final long turretKills;
    private final long visionScore;
    private final long visionWardsBoughtInGame;
    private final long wardsKilled;
    private final long wardsPlaced;
    private final boolean win;

    private final long alliedJungleMonsterKills;
    private final long buffsStolen;
    private final long controlWardsPlaced;
    private final long damagePerMinute;
    private final float damageTakenOnTeamPercentage;
    private final long dancedWithRiftHerald;
    private final long effectiveHealAndShielding;
    private final long enemyJungleMonsterKills;
    private final long epicMonsterKillsNearEnemyJungler;
    private final long epicMonsterKillsWithin30SecondsOfSpawn;
    private final long epicMonsterSteals;
    private final float firstTurretKilledTime;
    private final long flawlessAces;
    private final long fullTeamTakedown;
    private final float gameLength;
    private final long goldPerMinute;
    private final long hadOpenNexus;
    private final float kda;
    private final float killParticipation;
    private final long riftHeraldTakedowns;
    private final long scuttleCrabKills;
    private final float shortestTimeToAceFromFirstTakedown;
    private final long skillshotsDodged;
    private final long skillshotsHit;
    private final long soloKills;
    private final long stealthWardsPlaced;
    private final long survivedSingleDigitHpCount;
    private final long takedowns;
    private final long takedownsBeforeJungleMinionSpawn;
    private final long takedownsInAlcove;
    private final long takedownsInEnemyFountain;
    private final float teamDamagePercentage;
    private final long turretPlatesTaken;
    private final long turretTakedowns;
    private final float visionScorePerMinute;
    private final long wardTakedowns;
    private final long wardsGuarded;

    @JsonCreator
    public GameParticipantsDTO(
            @JsonProperty("assists") long assists,
            @JsonProperty("baronKills") long baronKills,
            @JsonProperty("challenges") ChallengesDTO challenges,
            @JsonProperty("championName") String championName,
            @JsonProperty("damageSelfMitigated") long damageSelfMitigated,
            @JsonProperty("deaths") long deaths,
            @JsonProperty("doubleKills") long doubleKills,
            @JsonProperty("dragonKills") long dragonKills,
            @JsonProperty("firstBloodAssist") boolean firstBloodAssist,
            @JsonProperty("firstBloodKill") boolean firstBloodKill,
            @JsonProperty("firstTowerAssist") boolean firstTowerAssist,
            @JsonProperty("firstTowerKill") boolean firstTowerKill,
            @JsonProperty("goldEarned") long goldEarned,
            @JsonProperty("inhibitorKills") long inhibitorKills,
            @JsonProperty("killingSprees") long killingSprees,
            @JsonProperty("kills") long kills,
            @JsonProperty("largestCriticalStrike") long largestCriticalStrike,
            @JsonProperty("largestKillingSpree") long largestKillingSpree,
            @JsonProperty("largestMultiKill") long largestMultiKill,
            @JsonProperty("longestTimeSpentLiving") float longestTimeSpentLiving,
            @JsonProperty("magicDamageDealtToChampions") long magicDamageDealtToChampions,
            @JsonProperty("neutralMinionsKilled") long neutralMinionsKilled,
            @JsonProperty("objectivesStolen") long objectivesStolen,
            @JsonProperty("pentaKills") long pentaKills,
            @JsonProperty("physicalDamageDealtToChampions") long physicalDamageDealtToChampions,
            @JsonProperty("quadraKills") long quadraKills,
            @JsonProperty("role") String role,
            @JsonProperty("spell1Casts") long spell1Casts,
            @JsonProperty("spell2Casts") long spell2Casts,
            @JsonProperty("spell3Casts") long spell3Casts,
            @JsonProperty("spell4Casts") long spell4Casts,
            @JsonProperty("summoner1Casts") long summoner1Casts,
            @JsonProperty("summoner1Id") long summoner1Id,
            @JsonProperty("summoner2Casts") long summoner2Casts,
            @JsonProperty("summoner2Id") long summoner2Id,
            @JsonProperty("summonerName") String summonerName,
            @JsonProperty("timeCCingOthers") long timeCCingOthers,
            @JsonProperty("totalDamageDealtToChampions") long totalDamageDealtToChampions,
            @JsonProperty("totalDamageShieldedOnTeammates") long totalDamageShieldedOnTeammates,
            @JsonProperty("totalDamageTaken") long totalDamageTaken,
            @JsonProperty("totalHealsOnTeammates") long totalHealsOnTeammates,
            @JsonProperty("totalMinionsKilled") long totalMinionsKilled,
            @JsonProperty("totalTimeSpentDead") float totalTimeSpentDead,
            @JsonProperty("tripleKills") long tripleKills,
            @JsonProperty("trueDamageDealtToChampions") long trueDamageDealtToChampions,
            @JsonProperty("turretKills") long turretKills,
            @JsonProperty("visionScore") long visionScore,
            @JsonProperty("visionWardsBoughtInGame") long visionWardsBoughtInGame,
            @JsonProperty("wardsKilled") long wardsKilled,
            @JsonProperty("wardsPlaced") long wardsPlaced,
            @JsonProperty("win") boolean win
    ) {
        this.assists = assists;
        this.baronKills = baronKills;
        this.championName = championName;
        this.damageSelfMitigated = damageSelfMitigated;
        this.deaths = deaths;
        this.doubleKills = doubleKills;
        this.dragonKills = dragonKills;
        this.firstBloodAssist = firstBloodAssist;
        this.firstBloodKill = firstBloodKill;
        this.firstTowerAssist = firstTowerAssist;
        this.firstTowerKill = firstTowerKill;
        this.goldEarned = goldEarned;
        this.inhibitorKills = inhibitorKills;
        this.killingSprees = killingSprees;
        this.kills = kills;
        this.largestCriticalStrike = largestCriticalStrike;
        this.largestKillingSpree = largestKillingSpree;
        this.largestMultiKill = largestMultiKill;
        this.longestTimeSpentLiving = (longestTimeSpentLiving / 60);
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        this.neutralMinionsKilled = neutralMinionsKilled;
        this.objectivesStolen = objectivesStolen;
        this.pentaKills = pentaKills;
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        this.quadraKills = quadraKills;
        this.role = role;
        this.spell1Casts = spell1Casts;
        this.spell2Casts = spell2Casts;
        this.spell3Casts = spell3Casts;
        this.spell4Casts = spell4Casts;
        this.summoner1Casts = summoner1Casts;
        this.summoner1Id = summoner1Id;
        this.summoner2Casts = summoner2Casts;
        this.summoner2Id = summoner2Id;
        this.summonerName = summonerName;
        this.timeCCingOthers = timeCCingOthers;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.totalDamageShieldedOnTeammates = totalDamageShieldedOnTeammates;
        this.totalDamageTaken = totalDamageTaken;
        this.totalHealsOnTeammates = totalHealsOnTeammates;
        this.totalMinionsKilled = totalMinionsKilled;
        this.totalTimeSpentDead = (totalTimeSpentDead / 60);
        this.tripleKills = tripleKills;
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        this.turretKills = turretKills;
        this.visionScore = visionScore;
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        this.wardsKilled = wardsKilled;
        this.wardsPlaced = wardsPlaced;
        this.win = win;

        this.alliedJungleMonsterKills = challenges.getAlliedJungleMonsterKills();
        this.buffsStolen = challenges.getBuffsStolen();
        this.controlWardsPlaced = challenges.getControlWardsPlaced();
        this.damagePerMinute = challenges.getDamagePerMinute();
        this.damageTakenOnTeamPercentage = challenges.getDamageTakenOnTeamPercentage();
        this.dancedWithRiftHerald = challenges.getDancedWithRiftHerald();
        this.effectiveHealAndShielding = challenges.getEffectiveHealAndShielding();
        this.enemyJungleMonsterKills = challenges.getEnemyJungleMonsterKills();
        this.epicMonsterKillsNearEnemyJungler = challenges.getEpicMonsterKillsNearEnemyJungler();
        this.epicMonsterKillsWithin30SecondsOfSpawn = challenges.getEpicMonsterKillsWithin30SecondsOfSpawn();
        this.epicMonsterSteals = challenges.getEpicMonsterSteals();
        this.firstTurretKilledTime = (challenges.getFirstTurretKilledTime() / 60);
        this.flawlessAces = challenges.getFlawlessAces();
        this.fullTeamTakedown = challenges.getFullTeamTakedown();
        this.gameLength = (challenges.getGameLength() / 60);
        this.goldPerMinute = challenges.getGoldPerMinute();
        this.hadOpenNexus = challenges.getHadOpenNexus();
        this.kda = challenges.getKda();
        this.killParticipation = challenges.getKillParticipation();
        this.riftHeraldTakedowns = challenges.getRiftHeraldTakedowns();
        this.scuttleCrabKills = challenges.getScuttleCrabKills();
        this.shortestTimeToAceFromFirstTakedown = challenges.getShortestTimeToAceFromFirstTakedown();
        this.skillshotsDodged = challenges.getSkillshotsDodged();
        this.skillshotsHit = challenges.getSkillshotsHit();
        this.soloKills = challenges.getSoloKills();
        this.stealthWardsPlaced = challenges.getStealthWardsPlaced();
        this.survivedSingleDigitHpCount = challenges.getSurvivedSingleDigitHpCount();
        this.takedowns = challenges.getTakedowns();
        this.takedownsBeforeJungleMinionSpawn = challenges.getTakedownsBeforeJungleMinionSpawn();
        this.takedownsInAlcove = challenges.getTakedownsInAlcove();
        this.takedownsInEnemyFountain = challenges.getTakedownsInEnemyFountain();
        this.teamDamagePercentage = challenges.getTeamDamagePercentage();
        this.turretPlatesTaken = challenges.getTurretPlatesTaken();
        this.turretTakedowns = challenges.getTurretTakedowns();
        this.visionScorePerMinute = challenges.getVisionScorePerMinute();
        this.wardTakedowns = challenges.getWardTakedowns();
        this.wardsGuarded = challenges.getWardsGuarded();
    }

    public long getAssists() {
        return assists;
    }

    public long getBaronKills() {
        return baronKills;
    }

    public String getChampionName() {
        return championName;
    }

    public long getDamageSelfMitigated() {
        return damageSelfMitigated;
    }

    public long getDeaths() {
        return deaths;
    }

    public long getDoubleKills() {
        return doubleKills;
    }

    public long getDragonKills() {
        return dragonKills;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public long getGoldEarned() {
        return goldEarned;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public long getKillingSprees() {
        return killingSprees;
    }

    public long getKills() {
        return kills;
    }

    public long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public long getLargestMultiKill() {
        return largestMultiKill;
    }

    public float getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public long getObjectivesStolen() {
        return objectivesStolen;
    }

    public long getPentaKills() {
        return pentaKills;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public long getQuadraKills() {
        return quadraKills;
    }

    public String getRole() {
        return role;
    }

    public long getSpell1Casts() {
        return spell1Casts;
    }

    public long getSpell2Casts() {
        return spell2Casts;
    }

    public long getSpell3Casts() {
        return spell3Casts;
    }

    public long getSpell4Casts() {
        return spell4Casts;
    }

    public long getSummoner1Casts() {
        return summoner1Casts;
    }

    public long getSummoner1Id() {
        return summoner1Id;
    }

    public long getSummoner2Casts() {
        return summoner2Casts;
    }

    public long getSummoner2Id() {
        return summoner2Id;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public long getTimeCCingOthers() {
        return timeCCingOthers;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public long getTotalDamageShieldedOnTeammates() {
        return totalDamageShieldedOnTeammates;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public long getTotalHealsOnTeammates() {
        return totalHealsOnTeammates;
    }

    public long getTotalMinionsKilled() {
        return totalMinionsKilled;
    }

    public float getTotalTimeSpentDead() {
        return totalTimeSpentDead;
    }

    public long getTripleKills() {
        return tripleKills;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public long getTurretKills() {
        return turretKills;
    }

    public long getVisionScore() {
        return visionScore;
    }

    public long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public long getWardsKilled() {
        return wardsKilled;
    }

    public long getWardsPlaced() {
        return wardsPlaced;
    }

    public boolean getWin() {
        return win;
    }


    public long getAlliedJungleMonsterKills() {
        return alliedJungleMonsterKills;
    }

    public long getBuffsStolen() {
        return buffsStolen;
    }

    public long getControlWardsPlaced() {
        return controlWardsPlaced;
    }

    public long getDamagePerMinute() {
        return damagePerMinute;
    }

    public float getDamageTakenOnTeamPercentage() {
        return damageTakenOnTeamPercentage;
    }

    public long getDancedWithRiftHerald() {
        return dancedWithRiftHerald;
    }

    public long getEffectiveHealAndShielding() {
        return effectiveHealAndShielding;
    }

    public long getEnemyJungleMonsterKills() {
        return enemyJungleMonsterKills;
    }

    public long getEpicMonsterKillsNearEnemyJungler() {
        return epicMonsterKillsNearEnemyJungler;
    }

    public long getEpicMonsterKillsWithin30SecondsOfSpawn() {
        return epicMonsterKillsWithin30SecondsOfSpawn;
    }

    public long getEpicMonsterSteals() {
        return epicMonsterSteals;
    }

    public float getFirstTurretKilledTime() {
        return firstTurretKilledTime;
    }

    public long getFlawlessAces() {
        return flawlessAces;
    }

    public long getFullTeamTakedown() {
        return fullTeamTakedown;
    }

    public float getGameLength() {
        return gameLength;
    }

    public long getGoldPerMinute() {
        return goldPerMinute;
    }

    public long getHadOpenNexus() {
        return hadOpenNexus;
    }

    public float getKda() {
        return kda;
    }

    public float getKillParticipation() {
        return killParticipation;
    }

    public long getRiftHeraldTakedowns() {
        return riftHeraldTakedowns;
    }

    public long getScuttleCrabKills() {
        return scuttleCrabKills;
    }

    public float getShortestTimeToAceFromFirstTakedown() {
        return shortestTimeToAceFromFirstTakedown;
    }

    public long getSkillshotsDodged() {
        return skillshotsDodged;
    }

    public long getSkillshotsHit() {
        return skillshotsHit;
    }

    public long getSoloKills() {
        return soloKills;
    }

    public long getStealthWardsPlaced() {
        return stealthWardsPlaced;
    }

    public long getSurvivedSingleDigitHpCount() {
        return survivedSingleDigitHpCount;
    }

    public long getTakedowns() {
        return takedowns;
    }

    public long getTakedownsBeforeJungleMinionSpawn() {
        return takedownsBeforeJungleMinionSpawn;
    }

    public long getTakedownsInAlcove() {
        return takedownsInAlcove;
    }

    public long getTakedownsInEnemyFountain() {
        return takedownsInEnemyFountain;
    }

    public float getTeamDamagePercentage() {
        return teamDamagePercentage;
    }

    public long getTurretPlatesTaken() {
        return turretPlatesTaken;
    }

    public long getTurretTakedowns() {
        return turretTakedowns;
    }

    public float getVisionScorePerMinute() {
        return visionScorePerMinute;
    }

    public long getWardTakedowns() {
        return wardTakedowns;
    }

    public long getWardsGuarded() {
        return wardsGuarded;
    }
}

package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChallengesDTO {

    private final long abilityUses;
    private final long acesBefore15Minutes;
    private final long alliedJungleMonsterKills;
    private final long blastConeOppositeOpponentCount;
    private final long buffsStolen;
    private final long controlWardsPlaced;
    private final long damagePerMinute;
    private final long damageTakenOnTeamPercentage;
    private final long dancedWithRiftHerald;
    private final long effectiveHealAndShielding;
    private final long elderDragonKillsWithOpposingSoul;
    private final long elderDragonMultikills;
    private final long enemyChampionImmobilizations;
    private final long enemyJungleMonsterKills;
    private final long epicMonsterKillsNearEnemyJungler;
    private final long epicMonsterKillsWithin30SecondsOfSpawn;
    private final long epicMonsterSteals;
    private final long firstTurretKilledTime;
    private final long flawlessAces;
    private final long fullTeamTakedown;
    private final long gameLength;
    private final long goldPerMinute;
    private final long hadOpenNexus;
    private final float kda;
    private final float killParticipation;
    private final long maxKillDeficit;
    private final long mostWardsDestroyedOneSweeper;
    private final long perfectDragonSoulsTaken;
    private final long riftHeraldTakedowns;
    private final long scuttleCrabKills;
    private final long shortestTimeToAceFromFirstTakedown;
    private final long skillshotsDodged;
    private final long skillshotsHit;
    private final long soloKills;
    private final long stealthWardsPlaced;
    private final long survivedSingleDigitHpCount;
    private final long takedowns;
    private final long takedownsBeforeJungleMinionSpawn;
    private final long takedownsInAlcove;
    private final long takedownsInEnemyFountain;
    private final long teamDamagePercentage;
    private final long teamElderDragonKills;
    private final long teamRiftHeraldKills;
    private final long turretPlatesTaken;
    private final long turretTakedowns;
    private final long visionScorePerMinute;
    private final long wardTakedowns;
    private final long wardsGuarded;

    @JsonCreator
    public ChallengesDTO(
            @JsonProperty("abilityUses,") long abilityUses,
            @JsonProperty("acesBefore15Minutes,") long acesBefore15Minutes,
            @JsonProperty("alliedJungleMonsterKills,") long alliedJungleMonsterKills,
            @JsonProperty("blastConeOppositeOpponentCount,") long blastConeOppositeOpponentCount,
            @JsonProperty("buffsStolen,") long buffsStolen,
            @JsonProperty("controlWardsPlaced,") long controlWardsPlaced,
            @JsonProperty("damagePerMinute,") long damagePerMinute,
            @JsonProperty("damageTakenOnTeamPercentage,") long damageTakenOnTeamPercentage,
            @JsonProperty("dancedWithRiftHerald,") long dancedWithRiftHerald,
            @JsonProperty("effectiveHealAndShielding,") long effectiveHealAndShielding,
            @JsonProperty("elderDragonKillsWithOpposingSoul,") long elderDragonKillsWithOpposingSoul,
            @JsonProperty("elderDragonMultikills,") long elderDragonMultikills,
            @JsonProperty("enemyChampionImmobilizations,") long enemyChampionImmobilizations,
            @JsonProperty("enemyJungleMonsterKills,") long enemyJungleMonsterKills,
            @JsonProperty("epicMonsterKillsNearEnemyJungler,") long epicMonsterKillsNearEnemyJungler,
            @JsonProperty("epicMonsterKillsWithin30SecondsOfSpawn,") long epicMonsterKillsWithin30SecondsOfSpawn,
            @JsonProperty("epicMonsterSteals,") long epicMonsterSteals,
            @JsonProperty("firstTurretKilledTime,") long firstTurretKilledTime,
            @JsonProperty("flawlessAces,") long flawlessAces,
            @JsonProperty("fullTeamTakedown,") long fullTeamTakedown,
            @JsonProperty("gameLength,") long gameLength,
            @JsonProperty("goldPerMinute,") long goldPerMinute,
            @JsonProperty("hadOpenNexus,") long hadOpenNexus,
            @JsonProperty("kda,") long kda,
            @JsonProperty("killParticipation,") long killParticipation,
            @JsonProperty("maxKillDeficit,") long maxKillDeficit,
            @JsonProperty("mostWardsDestroyedOneSweeper,") long mostWardsDestroyedOneSweeper,
            @JsonProperty("perfectDragonSoulsTaken,") long perfectDragonSoulsTaken,
            @JsonProperty("riftHeraldTakedowns,") long riftHeraldTakedowns,
            @JsonProperty("scuttleCrabKills,") long scuttleCrabKills,
            @JsonProperty("shortestTimeToAceFromFirstTakedown,") long shortestTimeToAceFromFirstTakedown,
            @JsonProperty("skillshotsDodged,") long skillshotsDodged,
            @JsonProperty("skillshotsHit,") long skillshotsHit,
            @JsonProperty("soloKills,") long soloKills,
            @JsonProperty("stealthWardsPlaced,") long stealthWardsPlaced,
            @JsonProperty("survivedSingleDigitHpCount,") long survivedSingleDigitHpCount,
            @JsonProperty("takedowns,") long takedowns,
            @JsonProperty("takedownsBeforeJungleMinionSpawn,") long takedownsBeforeJungleMinionSpawn,
            @JsonProperty("takedownsInAlcove,") long takedownsInAlcove,
            @JsonProperty("takedownsInEnemyFountain,") long takedownsInEnemyFountain,
            @JsonProperty("teamDamagePercentage,") long teamDamagePercentage,
            @JsonProperty("teamElderDragonKills,") long teamElderDragonKills,
            @JsonProperty("teamRiftHeraldKills,") long teamRiftHeraldKills,
            @JsonProperty("turretPlatesTaken,") long turretPlatesTaken,
            @JsonProperty("turretTakedowns,") long turretTakedowns,
            @JsonProperty("visionScorePerMinute,") long visionScorePerMinute,
            @JsonProperty("wardTakedowns,") long wardTakedowns,
            @JsonProperty("wardsGuarded) {") long wardsGuarded) {
        this.abilityUses = abilityUses;
        this.acesBefore15Minutes = acesBefore15Minutes;
        this.alliedJungleMonsterKills = alliedJungleMonsterKills;
        this.blastConeOppositeOpponentCount = blastConeOppositeOpponentCount;
        this.buffsStolen = buffsStolen;
        this.controlWardsPlaced = controlWardsPlaced;
        this.damagePerMinute = damagePerMinute;
        this.damageTakenOnTeamPercentage = damageTakenOnTeamPercentage;
        this.dancedWithRiftHerald = dancedWithRiftHerald;
        this.effectiveHealAndShielding = effectiveHealAndShielding;
        this.elderDragonKillsWithOpposingSoul = elderDragonKillsWithOpposingSoul;
        this.elderDragonMultikills = elderDragonMultikills;
        this.enemyChampionImmobilizations = enemyChampionImmobilizations;
        this.enemyJungleMonsterKills = enemyJungleMonsterKills;
        this.epicMonsterKillsNearEnemyJungler = epicMonsterKillsNearEnemyJungler;
        this.epicMonsterKillsWithin30SecondsOfSpawn = epicMonsterKillsWithin30SecondsOfSpawn;
        this.epicMonsterSteals = epicMonsterSteals;
        this.firstTurretKilledTime = firstTurretKilledTime;
        this.flawlessAces = flawlessAces;
        this.fullTeamTakedown = fullTeamTakedown;
        this.gameLength = gameLength;
        this.goldPerMinute = goldPerMinute;
        this.hadOpenNexus = hadOpenNexus;
        this.kda = kda;
        this.killParticipation = killParticipation;
        this.maxKillDeficit = maxKillDeficit;
        this.mostWardsDestroyedOneSweeper = mostWardsDestroyedOneSweeper;
        this.perfectDragonSoulsTaken = perfectDragonSoulsTaken;
        this.riftHeraldTakedowns = riftHeraldTakedowns;
        this.scuttleCrabKills = scuttleCrabKills;
        this.shortestTimeToAceFromFirstTakedown = shortestTimeToAceFromFirstTakedown;
        this.skillshotsDodged = skillshotsDodged;
        this.skillshotsHit = skillshotsHit;
        this.soloKills = soloKills;
        this.stealthWardsPlaced = stealthWardsPlaced;
        this.survivedSingleDigitHpCount = survivedSingleDigitHpCount;
        this.takedowns = takedowns;
        this.takedownsBeforeJungleMinionSpawn = takedownsBeforeJungleMinionSpawn;
        this.takedownsInAlcove = takedownsInAlcove;
        this.takedownsInEnemyFountain = takedownsInEnemyFountain;
        this.teamDamagePercentage = teamDamagePercentage;
        this.teamElderDragonKills = teamElderDragonKills;
        this.teamRiftHeraldKills = teamRiftHeraldKills;
        this.turretPlatesTaken = turretPlatesTaken;
        this.turretTakedowns = turretTakedowns;
        this.visionScorePerMinute = visionScorePerMinute;
        this.wardTakedowns = wardTakedowns;
        this.wardsGuarded = wardsGuarded;
    }

    public long getAbilityUses() {
        return abilityUses;
    }

    public long getAcesBefore15Minutes() {
        return acesBefore15Minutes;
    }

    public long getAlliedJungleMonsterKills() {
        return alliedJungleMonsterKills;
    }

    public long getBlastConeOppositeOpponentCount() {
        return blastConeOppositeOpponentCount;
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

    public long getDamageTakenOnTeamPercentage() {
        return damageTakenOnTeamPercentage;
    }

    public long getDancedWithRiftHerald() {
        return dancedWithRiftHerald;
    }

    public long getEffectiveHealAndShielding() {
        return effectiveHealAndShielding;
    }

    public long getElderDragonKillsWithOpposingSoul() {
        return elderDragonKillsWithOpposingSoul;
    }

    public long getElderDragonMultikills() {
        return elderDragonMultikills;
    }

    public long getEnemyChampionImmobilizations() {
        return enemyChampionImmobilizations;
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

    public long getFirstTurretKilledTime() {
        return firstTurretKilledTime;
    }

    public long getFlawlessAces() {
        return flawlessAces;
    }

    public long getFullTeamTakedown() {
        return fullTeamTakedown;
    }

    public long getGameLength() {
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

    public long getMaxKillDeficit() {
        return maxKillDeficit;
    }

    public long getMostWardsDestroyedOneSweeper() {
        return mostWardsDestroyedOneSweeper;
    }

    public long getPerfectDragonSoulsTaken() {
        return perfectDragonSoulsTaken;
    }

    public long getRiftHeraldTakedowns() {
        return riftHeraldTakedowns;
    }

    public long getScuttleCrabKills() {
        return scuttleCrabKills;
    }

    public long getShortestTimeToAceFromFirstTakedown() {
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

    public long getTeamDamagePercentage() {
        return teamDamagePercentage;
    }

    public long getTeamElderDragonKills() {
        return teamElderDragonKills;
    }

    public long getTeamRiftHeraldKills() {
        return teamRiftHeraldKills;
    }

    public long getTurretPlatesTaken() {
        return turretPlatesTaken;
    }

    public long getTurretTakedowns() {
        return turretTakedowns;
    }

    public long getVisionScorePerMinute() {
        return visionScorePerMinute;
    }

    public long getWardTakedowns() {
        return wardTakedowns;
    }

    public long getWardsGuarded() {
        return wardsGuarded;
    }
}

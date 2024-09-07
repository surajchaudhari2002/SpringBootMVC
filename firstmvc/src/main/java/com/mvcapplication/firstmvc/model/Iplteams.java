package com.mvcapplication.firstmvc.model;

import org.springframework.stereotype.Component;

@Component

public class Iplteams {
    private String teamName;
    private String captainName;
    private int trophies;

        public Iplteams() {
        }

        public Iplteams(String teamName, String captainName, int trophies) {
            this.teamName = teamName;
            this.captainName = captainName;
            this.trophies = trophies;
        }

        @Override
        public String toString() {
            return "IplTeams{" +
                    "teamName='" + teamName + '\'' +
                    ", captainName='" + captainName + '\'' +
                    ", trophies=" + trophies +
                    '}';
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getCaptainName() {
            return captainName;
        }

        public void setCaptainName(String captainName) {
            this.captainName = captainName;
        }

        public int getTrophies() {
            return trophies;
        }

        public void setTrophies(int trophies) {
            this.trophies = trophies;
        }
    }


package com.springdemo.firstdemo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Iplteam {

    String teamName;
    String teamCaptain;
    String trophies;


    public Iplteam(String teamName, String teamCaptain, String trophies) {
        super();
        this.teamName = teamName;
        this.teamCaptain = teamCaptain;
        this.trophies = trophies;
    }
    public Iplteam() {
        super();
    }

    @Override
    public String toString() {
        return "Iplteam{" +
                "teamName='" + teamName + '\'' +
                ", teamCaptain='" + teamCaptain + '\'' +
                ", trophies='" + trophies + '\'' +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCaptain() {
        return teamCaptain;
    }

    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }

    public String getTrophies() {
        return trophies;
    }

    public void setTrophies(String trophies) {
        this.trophies = trophies;
    }
}

package com.springdemo.firstdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {
    @GetMapping()
    public String hello(){
        return "Hello Suraj";
    }

    @GetMapping("/iplteam")
    public String[] iplteam(){
        String[] team={"mi","csk","kkr","rcb"};
        return team;
        }

        @GetMapping("/teamsdata")
        public ArrayList<Iplteam> teamsdata(){
        ArrayList<Iplteam> teams=new ArrayList<Iplteam>();
            teams.add(new Iplteam("MI","ROHIT","5"));
            teams.add(new Iplteam("CSK","DHONI","5"));
            teams.add(new Iplteam("RCB","VIRAT","0"));
        return teams;
        }

    @GetMapping("/teamdata/{teamname}")
    public ArrayList<Iplteam> teamdata(@PathVariable String teamname){
        ArrayList<Iplteam> team=new ArrayList<Iplteam>();
        if(teamname.equals("mi")){
            team.add(new Iplteam("MI","ROHIT","5"));
        } else if (teamname.equals("csk")) {
            team.add(new Iplteam("CSK","DHONI","5"));
        } else if (teamname.equals("rcb")) {

            team.add(new Iplteam("RCB","VIRAT","0"));
        }
        return team;
    }

}

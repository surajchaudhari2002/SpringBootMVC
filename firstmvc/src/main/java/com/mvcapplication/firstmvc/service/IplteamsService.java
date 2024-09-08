package com.mvcapplication.firstmvc.service;

import com.mvcapplication.firstmvc.dao.IplDao;
import com.mvcapplication.firstmvc.model.Iplteams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@Service

public class IplteamsService {
    @Autowired
    IplDao iplDao;
    public  List<Iplteams> getIplteams() throws SQLException, ClassNotFoundException {
        return iplDao.getIplteams();
    }

    public String saveIplteam(Iplteams iplteam) throws SQLException, ClassNotFoundException {
        String msg=iplDao.addIplteams(iplteam);
        return msg;
    }

    public String updateCaptainName(String teamName, String captainName) throws SQLException, ClassNotFoundException {
        String msg=iplDao.updateCaptainName(teamName,captainName);
        return msg;

    }

    public String updateIplteam(Iplteams iplteam) throws SQLException, ClassNotFoundException {
       String msg =iplDao.updateIplteam(iplteam);
       return msg;
    }

    public String deleteteam(String teamName) throws SQLException, ClassNotFoundException {
        String msg=iplDao.deleteteam(teamName);
        return msg;
    }
}

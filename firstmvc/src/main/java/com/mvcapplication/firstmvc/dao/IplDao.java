package com.mvcapplication.firstmvc.dao;

import com.mvcapplication.firstmvc.DbConnection;
import com.mvcapplication.firstmvc.model.Iplteams;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;

@Repository

public class IplDao {
    public ArrayList<Iplteams> getIplteams() throws ClassNotFoundException, SQLException {
        ArrayList<Iplteams> list=new ArrayList<Iplteams>();
        Connection connection=DbConnection.DbConnect();
        Statement statement= connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from iplteams");
        while (resultSet.next()){
            String teamName=resultSet.getString("teamName");
            String captainName=resultSet.getString("captainName");
            int trophies=resultSet.getInt("trophies");

            Iplteams iplteams=new Iplteams(teamName,captainName,trophies);
            list.add(iplteams);
        }
       return list;
    }

    public String addIplteams(Iplteams iplteam) throws SQLException, ClassNotFoundException {
       Connection connection= DbConnection.DbConnect();
       PreparedStatement preparedStatement=connection.prepareStatement("insert into iplteams values(?,?,?)");

       preparedStatement.setString(1,iplteam.getTeamName());
       preparedStatement.setString(2,iplteam.getCaptainName());
       preparedStatement.setInt(3,0);

       preparedStatement.executeUpdate();//use when we perform insert, update, delete operations
        return "Data added Successfully...!!";
    }

    public String updateCaptainName(String teamName, String captainName) throws SQLException, ClassNotFoundException {
       Connection connection= DbConnection.DbConnect();
       PreparedStatement preparedStatement=connection.prepareStatement("update iplteams set captainName=? where teamName=?");

       preparedStatement.setString(1,captainName);
       preparedStatement.setString(2,teamName);

       preparedStatement.executeUpdate();

        return "Updated Succesfully..!!";
    }

    public String updateIplteam(Iplteams iplteam) throws SQLException, ClassNotFoundException {
        Connection connection=DbConnection.DbConnect();
        PreparedStatement preparedStatement=connection.prepareStatement("update iplteams set captainName=? , trophies=? where teamName=?");

        preparedStatement.setString(1,iplteam.getCaptainName());
        preparedStatement.setInt(2,iplteam.getTrophies());
        preparedStatement.setString(3,iplteam.getTeamName());

        preparedStatement.executeUpdate();
        return "Updated Succesfully..!";
    }

    public String deleteteam(String teamName) throws SQLException, ClassNotFoundException {
        Connection connection=DbConnection.DbConnect();
        PreparedStatement preparedStatement=connection.prepareStatement("delete from iplteams where teamName=?");
        preparedStatement.setString(1,teamName);
        preparedStatement.executeUpdate();
        return "Deleted Succesfully..!";

    }
}

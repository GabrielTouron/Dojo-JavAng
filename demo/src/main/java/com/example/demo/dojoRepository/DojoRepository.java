package com.example.demo.dojoRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dojoEntity.Dojo;

import org.springframework.stereotype.Repository;

@Repository
public class DojoRepository {

    private final static String DB_URL = "jdbc:mysql://dev-0320-db.javarover.wilders.dev:3307/bordeaux";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "as54S4QQzs5s5";

    public List<Dojo> findAll() {
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            statement = connection.prepareStatement(
                "SELECT * FROM dojo;"
            );
            
            resultSet = statement.executeQuery();
            
           List<Dojo> dojos = new ArrayList<>();
            
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                dojos.add(new Dojo(id, name));
            }
            return dojos;
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return null;
    }
}

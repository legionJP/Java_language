package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException , ParseException, IOException, org.json.simple.parser.ParseException
    {
        // System.out.println( "Hello World!" );

        // load and register
        Class.forName("org.postgresql.Driver");

        // Read the configuration file: 
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("/etc/config_db.json"));

        // Extract the connection details

        String url = (String) config.get("url");
        String uname = (String) config.get("username");
        String pass = (String) config.get("password");

        // OR
        
        // // create the connection // Connection is interface so DriverManager is utility and has the getconnection 
        // String url = "jdbc:postgresql://localhost:5432/jdatabase";
        // String uname = "user";
        // String pass = "password";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection is Successful");

        // connection url is the databse number 

    }
}


//  Steps after 
//1. After importing the jar file or setting up the pom.xml

// 2. Import the Packages ---> Java.sql
//  * 3. Load the Driver which is coming from jar file 
//  * 4. Register the Driver 
//  * 5. Create the Connection Object
//  * 6. Create the Statement 
//  * 7. Execute the Statement 
//  * 8. Close the connection to prevent the leaking the resources.
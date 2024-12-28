package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException , ParseException, IOException, org.json.simple.parser.ParseException
    {
        // System.out.println( "Hello World!" );

        // load and register
        Class.forName("org.postgresql.Driver"); // this is optional 

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

//  Getting the data from database;
        String query = "select sname from student where sid=2";

        Statement  st = con.createStatement(); // it is interface

// execute statement
        //st.executeQuery(query);  // geting the quey 

        ResultSet rs = st.executeQuery(query);
       // System.out.println(rs.next());  // gives the bool value if have the next row return true 

// printing the data 

        //use the .next after executing the query as .next get the 1st record if you are before the 1st line
        rs.next();
        String name=  rs.getString("sname");  // need to mention the columnname 
        System.out.println("Name of the student is "+ name);
        rs.getString(1); //getting the column number to get columnn data


// Fetching all the records 
        

        con.close();

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
package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

        String url = (String) config.get("url");   // connection url is the databse number 
        String uname = (String) config.get("username");
        String pass = (String) config.get("password");

        // OR

        // // create the connection // Connection is interface so DriverManager is utility and has the getconnection 
        // String url = "jdbc:postgresql://localhost:5432/jdatabase";
        // String uname = "user";
        // String pass = "password";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection is Successful");

// 1. Getting the data from database;
        String query = "select sname from student where sid=2";
        String query1 = "select * from student";
//-----------------------------------------------------------------------------------------

        Statement  st = con.createStatement(); // it is interface

//2. execute statement
        //st.executeQuery(query);  // geting the quey 
//-----------------------------------------------------------------------------------------
       // ResultSet rs = st.executeQuery(query);
       // System.out.println(rs.next());  // gives the bool value if have the next row return true 
//-----------------------------------------------------------------------------------------
//3. printing the data 

        //use the .next after executing the query as .next get the 1st record if you are before the 1st line
        // rs.next();
        // String name=  rs.getString("sname");  // need to mention the columnname 
        // System.out.println("Name of the student is "+ name);
        // rs.getString(1); //getting the column number to get columnn data

//-----------------------------------------------------------------------------------------
//4. Fetching all the records 

        ResultSet rs1 = st.executeQuery(query1);   // fire the query
       // rs1.next(); // check if we have the next row 

        while(rs1.next()){
            System.out.print(rs1.getInt(1)+ "-");
            System.out.print(rs1.getString(2)+ "-");
            System.out.println(rs1.getInt(3));
        }

        //System.out.println("connection is closed ");
//-----------------------------------------------------------------------------------------
//5. Inserting the data or crud operations

        // String query3 = "insert into student values(5, 'JP', 25)";
        // boolean status = st.execute(query3);  // this can return resultSet if it is sql or select query true and return count  or false if it is insert or update query 
        // System.out.println(status);


//6. Updating  the data 
        // String query4 = "update student set sname ='Yogi Pahade' where sid=2";
        // st.execute(query4);

//7. Deleting the data 
        // String query5 = "delete from student where sid=2";
        // st.execute(query5);

//8. Inserting the values from the console , user or webpages
        //rs.next();
//         int sid = 2;
//         String sname = "Yogi Osho";
//         int marks = 29;

// // inappropriate to use "" as it is prone for the sql injection and need to improve the perfromance by caching the query in db
//         String query6 = "insert into student values(" + sid + ", '"+ sname +"',"+ marks + ")";  //concatinating
//         st.execute(query6);


//9. Using the PreparedStatement 
        int sid = 6;
        String sname = "HoneyPot";
        int marks = 10;
        String query7 = "insert into student values(?,?, ?)";

        PreparedStatement st1 = con.prepareStatement(query7);   // use the callable statemetn when we want to execute the stroe procedure 
        // mention the type of the data you are working 
        st1.setInt(1, sid);
        st1.setString(2, sname);
        st1.setInt(3, marks);
        st1.execute();

        con.close();



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
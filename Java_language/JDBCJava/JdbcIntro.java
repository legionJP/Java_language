package JDBCJava;

public class JdbcIntro {
    public static void main(String[] args) {
        System.out.println(" JDBC ");

    }
}

// JDBC : java Database Connectivity 
// Need to use the SQL to store the data 
// cooncetion b/w the application ---> JDBC , it is a API part of JDK 

// Actual implementation is done by the databases or dbms 
// we need jar file to coonect it 



// ------------------------------------------------------------------------//
// Postgres Setup in Linux Debian based
// Install
// sudo apt update
// sudo apt install postgresql postgresql-contrib

// Enable 

// sudo systemctl enable postgresql
// sudo systemctl start postgresql

// Access database
// sudo -u postgres psql  // as the super user 

// Create a New Database and User
/*
 * CREATE DATABASE mydatabase;
   CREATE USER myuser WITH ENCRYPTED PASSWORD 'mypassword';
   GRANT ALL PRIVILEGES ON DATABASE mydatabase TO myuser;
   psql -U myuser -d mydatabase

 * 
 * // Change the auth method to login usign the password 
 * 
 * sudo nano /etc/postgresql/Version_name/main/pg_hba.conf
 * change from peer to md5 for the local user 
 * local   all             all                                     md5
 * sudo systemctl restart postgresql
 * 
 */

 // connect new user with the databse using the md5 
//    psql -U myuser -d mydatabase

package com.bootcoding.jdbcexample;

public class JDBCOracleEx1 {
    public static void main(String[] args) throws ClassNotFoundException{

        //load and register the driver
        Class.forName("oracle.jdbc.driver.Oracle");

        //establish the connection
        Connection connection = DriverManager.getConnection("jdbc:oracle:@localhost:1521:xe","sys", "as sysdba");

        // Create statement object
        Statement statement = connection.createStatement();
    }
}

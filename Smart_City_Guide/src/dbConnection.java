
import java.sql.Connection;
import static java.lang.Class.forName;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class dbConnection {
    
    static Connection con;
    
    //Making a connection with the database
    public static Connection getConnection()
    {
        //Using try...catch block to catch if there's any exception
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
                                                       //providing the location of the database
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","");
        }
        catch(Exception ex)
        {
            System.out.println(""+ex);
        }
       return con;
    }
    
}

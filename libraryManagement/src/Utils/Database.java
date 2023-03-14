/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author chahrazed.benazaiez & nour.hariz
 */
public class Database {
    
    public static Connection connectDB(){
         // MY DATABASE IS library1
        String url = "jdbc:mysql://localhost:3306/library1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

        try{
        Class.forName("com.mysql.jdbc.Driver");
       
        Connection connect = DriverManager.getConnection(url, "root", "root");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device.login.system.base;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */

public abstract class Base {
    
    public static final String DBDriver = "oracle.jdbc.driver.OracleDriver";
    public static final String dbUsername="system";
    public static final String dbPassword="virtual";
    public static final String dbUrl ="jdbc:oracle:thin@localhost:1521:xe";
    protected PreparedStatement pst = null;
    protected Connection conn = null;
    protected ResultSet rst = null;
    
    public boolean getConnection() throws SQLException{
        boolean success = true;
        try {
            Class.forName(DBDriver);
            conn = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        } catch (ClassNotFoundException ex) {
            success = false;
            Logger.getLogger(Base.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
        
        
    }
    
public static void main(String[] Args){
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultis;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class DBUItis {
    public static Connection openConnection()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://localhost:1433; databaseName= ProductManagement;";
            Connection con= DriverManager.getConnection(url,"sa","nguyenhuynhvananh2111");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

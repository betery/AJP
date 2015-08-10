/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tools {
    public static Connection getConn() {
        try {
            return DriverManager.getConnection(
                    "jdbc:sqlserver://" + Constant.HOST + ":"
                            + Constant.PORT + ";databaseName=" + Constant.DB,
                    Constant.ACC, Constant.PASS);
        } catch (SQLException ex) {
            return null;
        }
    }
}

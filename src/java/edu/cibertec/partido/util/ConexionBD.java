package edu.cibertec.partido.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    public Connection obtenerConexion()
    {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
             cn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/examenbd","root","mysql");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cn;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author iscad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adriel Palestino
 */
public class Conexion {
    protected Connection conectar = null;
    private final String url = "jdbc:mysql://localhost/siu";
    private final String usuario = "root";
    private final String password = "";
       

 
    public void conectar() throws ClassNotFoundException{
    try{
        Class.forName("com.mysql.jdbc.Driver"); // De esta forma cargamos la clase Driver de MySQL.
        conectar = DriverManager.getConnection(url, usuario, password);
        System.out.println("Conexión Exitosa");
        }catch(SQLException ex){
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
    
    public void desconectar() throws SQLException{
        conectar.close();
    }
}

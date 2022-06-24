/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iscad
 */
public class Usuario {

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public boolean login() throws ClassNotFoundException, SQLException{
        boolean vRet = false;
        
        Conexion oC=new Conexion();
        oC.conectar();
        Statement st=oC.conectar.createStatement();
        ResultSet rs=st.executeQuery("Select * from usuario where usu='"+usuario+"' and pwd='"+pwd+"'");
        while(rs.next()){
            vRet=true;
        }
        
        return vRet;
        
    }
    
     
    
    protected String usuario;
    protected String pwd;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author iscad
 */
public class Maestro {

    public String getCodigo_maestro() {
        return codigo_maestro;
    }

    public void setCodigo_maestro(String codigo_maestro) {
        this.codigo_maestro = codigo_maestro;
    }

    public String getNombre_maestro() {
        return nombre_maestro;
    }

    public void setNombre_maestro(String nombre_maestro) {
        this.nombre_maestro = nombre_maestro;
    }

    public String getDireccion_maestro() {
        return direccion_maestro;
    }

    public void setDireccion_maestro(String direccion_maestro) {
        this.direccion_maestro = direccion_maestro;
    }

    public String getTelefono_maetro() {
        return telefono_maetro;
    }

    public void setTelefono_maetro(String telefono_maetro) {
        this.telefono_maetro = telefono_maetro;
    }

    public String getEmail_maestro() {
        return email_maestro;
    }

    public void setEmail_maestro(String email_maestro) {
        this.email_maestro = email_maestro;
    }

    public String getEstatus_maestro() {
        return estatus_maestro;
    }

    public void setEstatus_maestro(String estatus_maestro) {
        this.estatus_maestro = estatus_maestro;
    }
    
     public ArrayList todos() throws ClassNotFoundException, SQLException{
        boolean vRet = false;
        ArrayList<Maestro> todos=new ArrayList<Maestro>();
        Conexion oC=new Conexion();
        oC.conectar();
        Statement st=oC.conectar.createStatement();
        ResultSet rs=st.executeQuery("Select * from maestros");
        while(rs.next()){
            Maestro oA=new Maestro();
            oA.setCodigo_maestro(rs.getString("codigo_maestro"));
            oA.setDireccion_maestro(rs.getString("direccion_maestro"));
            oA.setEmail_maestro(rs.getString("email_maestro"));
            oA.setEstatus_maestro(rs.getString("estatus_maestro"));
            oA.setNombre_maestro(rs.getString("nombre_maestro"));
            todos.add(oA);
        }
        
        return todos;
        
    }
  private String  codigo_maestro="";
  private String nombre_maestro="";
  private String direccion_maestro="";
  private String telefono_maetro="";
  private String  email_maestro="";
  private String  estatus_maestro ="";
}

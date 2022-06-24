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
public class Alumno {

    public String getCarnet_alumno() {
        return carnet_alumno;
    }

    public void setCarnet_alumno(String carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getTelefono_alumno() {
        return telefono_alumno;
    }

    public void setTelefono_alumno(String telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

    public String getEstatus_alumno() {
        return estatus_alumno;
    }

    public void setEstatus_alumno(String estatus_alumno) {
        this.estatus_alumno = estatus_alumno;
    }
    
  protected String  carnet_alumno;
  protected String nombre_alumno;
  protected String telefono_alumno;
  protected String email_alumno;
  protected String estatus_alumno;
    
    public ArrayList todos() throws ClassNotFoundException, SQLException{
        boolean vRet = false;
        ArrayList<Alumno> todos=new ArrayList<Alumno>();
        Conexion oC=new Conexion();
        oC.conectar();
        Statement st=oC.conectar.createStatement();
        ResultSet rs=st.executeQuery("Select * from alumnos");
        while(rs.next()){
            Alumno oA=new Alumno();
            oA.setCarnet_alumno(rs.getString("carnet_alumno"));
            oA.setNombre_alumno(rs.getString("nombre_alumno"));
            oA.setTelefono_alumno(rs.getString("telefono_alumno"));
            oA.setEmail_alumno(rs.getString("email_alumno"));
            oA.setEstatus_alumno(rs.getString("estatus_alumno"));
            todos.add(oA);
        }
        
        return todos;
        
    }
}

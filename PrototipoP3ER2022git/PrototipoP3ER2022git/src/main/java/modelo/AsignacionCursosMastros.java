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
public class AsignacionCursosMastros {

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public String getCodigo_sede() {
        return codigo_sede;
    }

    public void setCodigo_sede(String codigo_sede) {
        this.codigo_sede = codigo_sede;
    }

    public String getCodigo_jornada() {
        return codigo_jornada;
    }

    public void setCodigo_jornada(String codigo_jornada) {
        this.codigo_jornada = codigo_jornada;
    }

    public String getCodigo_seccion() {
        return codigo_seccion;
    }

    public void setCodigo_seccion(String codigo_seccion) {
        this.codigo_seccion = codigo_seccion;
    }

    public String getCodigo_aula() {
        return codigo_aula;
    }

    public void setCodigo_aula(String codigo_aula) {
        this.codigo_aula = codigo_aula;
    }

    public String getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getCodigo_maestro() {
        return codigo_maestro;
    }

    public void setCodigo_maestro(String codigo_maestro) {
        this.codigo_maestro = codigo_maestro;
    }
    
    
    public boolean insertar() throws ClassNotFoundException, SQLException{
        boolean vRet=false;
        
        //TRANSACCION
        Conexion oC=new Conexion();
        oC.conectar(); //Conectamos a la base de datos
        Statement st=oC.conectar.createStatement(); //Crearemos el hilo de la conxion donde estara nuestra transaccion 
        try{
       
        oC.conectar.setAutoCommit(true);//Iniciamos la transaccion
        st.executeUpdate("insert into asignacioncursosmastros (codigo_carrera, codigo_sede, codigo_jornada, codigo_seccion, codigo_aula, codigo_curso) values('"+codigo_carrera+"','"+codigo_sede+",'"+codigo_jornada+"','"+codigo_seccion+"','"+codigo_aula+"','"+codigo_curso+"')");
        oC.conectar.commit(); //Si todo salio bien realizamos el commit
        vRet=true;
        }catch(Exception ex){
            //Si algo salio mal sehara un rollback sobre la tabla para regresar su estado anterior
            oC.conectar.rollback();
        }
        
        //Retornara verdadero en caso de que la transaccion este bien, falso en caso de que no
        return vRet;
    }
    
  private String codigo_carrera;
  private String  codigo_sede;
  private String  codigo_jornada;
  private String  codigo_seccion;
  private String  codigo_aula;
  private String  codigo_curso;
  private String  codigo_maestro;
}

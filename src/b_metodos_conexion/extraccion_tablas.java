/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_metodos_conexion;

import b_modelos.requerimiento;
import b_modelos.user;
import conexion_bbdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import b_modelos.categorias_prod;
import b_modelos.Produccion;
import b_modelos_para_tablas.ProduccionVSRequerimientos;
import java.util.Date;
import b_metodos_conexion.gestion_fechas;
import b_modelos_para_tablas.CriteriosVprodVreq;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author juan-jolo
 */
public class extraccion_tablas {
    PreparedStatement ps = null;
    ResultSet rs =null;
    
    
    public String UltimoElementoID (String nombreCampoID,String Tabla){
        String h="";
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select "+nombreCampoID+" from "
                    +Tabla+" ORDER by "+nombreCampoID+" DESC LIMIT 1");
            rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                h=String.valueOf(rs.getInt(1));
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return h;
    }
    
    
    public  String FilaSeleccionadaID (int n,String nombreCampoID,String Tabla){
        String h="";
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select "+nombreCampoID+" from "+Tabla);
            rs = ps.executeQuery();
            int i=0;
            while(rs.next() && i<=n){
                h=String.valueOf(rs.getInt(1));
                i++;
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return h;
    }
   
    public  String FilaSeleccionadaID (int n,String nombreCampoID,String Tabla, String join, String cond){
        String h="";
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select "+nombreCampoID+" from "+Tabla+" inner join "+join+" on "+cond);
            rs = ps.executeQuery();
            int i=0;
            while(rs.next() && i<=n){
                h=String.valueOf(rs.getInt(1));
                i++;
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return h;
    }
    
    
    
    
    
public ArrayList<requerimiento> elementos_requerimiento (){
        int n=0;
        ArrayList <requerimiento> lista_reqs = new ArrayList<requerimiento>();
        requerimiento temp_req = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select idrequerimiento,nombreReq,pagoEstimado,RUCempresa from requerimiento");
            rs = ps.executeQuery();
            while(rs.next()){
                temp_req=new requerimiento(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
                lista_reqs.add(temp_req);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_reqs;
    }


public ArrayList<user> usuarios_lista (){
        int n=0;
        ArrayList <user> lista_u = new ArrayList<user>();
        user temp_user = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select idUser,Nombre1,"
                    + "Nombre2,ApellidoP,ApellidoM, "
                    + "Email,tipoUsuario, Sueldo, TipoContrato "
                    + "from usuario");
            rs = ps.executeQuery();
            while(rs.next()){
                temp_user = new user();
                temp_user.setId_user(rs.getInt(1));
                temp_user.setNombre1(rs.getString(2));
                temp_user.setNombre2(rs.getString(3));
                temp_user.setAp_p(rs.getString(4));
                temp_user.setAp_m(rs.getString(5));
                temp_user.setEmail(rs.getString(6));
                temp_user.setTipo_usuario(rs.getString(7));
                temp_user.setSueldo(rs.getFloat(8));
                temp_user.setTipo_contrato(rs.getString(9));
                //temp_user=new requerimiento(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
                lista_u.add(temp_user);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_u;
    }

public user UsuarioDeseado (int ID){
    user temp_user = null;
    try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select * from usuario where idUser = ?");
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while(rs.next()){
                temp_user = new user();
                temp_user.setId_user(rs.getInt(1));
                temp_user.setNombre1(rs.getString(2));
                temp_user.setNombre2(rs.getString(3));
                temp_user.setAp_p(rs.getString(4));
                temp_user.setAp_m(rs.getString(5));
                temp_user.setPassword(rs.getString(6));
                temp_user.setSueldo(rs.getFloat(7));
                temp_user.setTipo_contrato(rs.getString(8));
                temp_user.setEmail(rs.getString(9));
                temp_user.setTipo_usuario(rs.getString(10));
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    return temp_user;
}


        public ArrayList <categorias_prod> categorias(){
        int n=0;
        ArrayList <categorias_prod> lista_cats = new ArrayList<categorias_prod>();
        categorias_prod temp_cat = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select * from categoria");
            rs = ps.executeQuery();
            while(rs.next()){
                temp_cat = new categorias_prod(rs.getInt(1),rs.getString(2));
              lista_cats.add(temp_cat);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_cats;
    }

    /* NO SE VA A USAR ---- REEMPLAZADO POR "TIPOSDEUSUARIO(STRING S) DONDE S
        ES EL VALOR DEL WHERE SQL
        
    public ArrayList<user> operarios_produccion(){
        int n=0;
        ArrayList <user> lista_reqs = new ArrayList<user>();
        user temp_user = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select idUser,Nombre1,Nombre2,ApellidoP,ApellidoM from "
                    + "usuario where tipoUsuario=\"Operario Produccion\"");
            rs = ps.executeQuery();
            while(rs.next()){
                temp_user=new user(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                lista_reqs.add(temp_user);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_reqs;
    }
    */
   
   public ArrayList<user> TipoDeUsuariosDeseados(String tipou){
        int n=0;
        ArrayList <user> lista_reqs = new ArrayList<user>();
        user temp_user = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select idUser,Nombre1,"
                    + "Nombre2,ApellidoP,ApellidoM from "
                    + "usuario where tipoUsuario=\""+tipou+"\"");
            rs = ps.executeQuery();
            while(rs.next()){
                temp_user=new user(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5));
                lista_reqs.add(temp_user);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_reqs;
    }
   
   public ArrayList<ProduccionVSRequerimientos> lista_prod_vs_req_JC(){
       ArrayList <ProduccionVSRequerimientos> lista_r = new ArrayList<ProduccionVSRequerimientos>();
       ProduccionVSRequerimientos r = null;
       try{
           Conexion c = new Conexion();
           ps = c.getConexion().prepareStatement("select idProduccion, "
                   + "fechaProduccion, urgencia, nombreReq, descripcion, "
                   + "fechaEntrega, nombre_emp, calidadReq, cantidad_productos "
                   + "from produccion "
                   + "inner join requerimiento "
                   + "on produccion.idrequerimiento=requerimiento.idrequerimiento "
                   + "where estadoProduccion=\"en Produccion\"");
           rs = ps.executeQuery();
           while(rs.next()){
               r = new ProduccionVSRequerimientos (rs.getInt(1),
                                      rs.getDate(2).toString(),
                                      rs.getString(3),
                                      rs.getString(4),
                                      rs.getString(5),
                                     rs.getDate(6).toString(),
                                      rs.getString(7),
                                      rs.getString(8),
                                      rs.getDouble(9)
                                      );
               lista_r.add(r);
           } 
           c.Desconectar();
       }catch (Exception e){
           e.printStackTrace();
       }
       return lista_r;
   }
   
  
   
    
    public ArrayList<ProduccionVSRequerimientos> lista_prod_vs_req(){
        int n=0;
        ArrayList <ProduccionVSRequerimientos> lista_pr = new ArrayList<ProduccionVSRequerimientos>();
        ProduccionVSRequerimientos join_1 = null;
        try{
            Conexion c = new Conexion();
            ps = c.getConexion().prepareStatement("select "
                    + "idProduccion,produccion.idrequerimiento,nombreReq,pagoEstimado,RUCempresa "
                    + "from produccion inner join requerimiento "
                    + "on produccion.idrequerimiento=requerimiento.idrequerimiento");
            rs = ps.executeQuery();
            while(rs.next()){
                int p1 = rs.getInt(1);
                int p2 = rs.getInt(2);
                String p3= rs.getString(3);
                double p4= rs.getDouble(4);
                String p5= rs.getString(5);
                join_1=new ProduccionVSRequerimientos(p2, p2, p5, p4, p5);
                lista_pr.add(join_1);
            }
            c.Desconectar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista_pr;
    }

    
      
    public ArrayList<CriteriosVprodVreq> lista_criterios_prod_req(int idinspector){
        ArrayList<CriteriosVprodVreq> acpr = new ArrayList<CriteriosVprodVreq>();
        CriteriosVprodVreq cpr = null;
        
        try{
           Conexion c = new Conexion();
           ps = c.getConexion().prepareStatement("select "
                   + "idcriterioCalidad, nombreCrit, esAceptable, nombreReq, descripcion, fechaEntrega "
                   + "from criteriocalidad "
                   + "inner join produccion on criteriocalidad.idProduccion = produccion.idProduccion "
                   + "inner join requerimiento on produccion.idrequerimiento = requerimiento.idrequerimiento "
                   + "where IDInspector= "+String.valueOf(idinspector)+" and esAceptable= 0");
           rs = ps.executeQuery();
           boolean verificador = rs.next();
           if (!verificador){
               acpr = null;
           }else{
               
                while(verificador){
                    int p0 = rs.getInt(1);
                    String p1 = rs.getString(2);
                    boolean p2 = rs.getBoolean(3);
                    String p3 = rs.getString(4);
                    String p4 = rs.getString(5);
                    String p5 = rs.getString(6);
                    cpr = new CriteriosVprodVreq(p0,p1, p2, p3, p4, p5);
                    acpr.add(cpr);
                    verificador = rs.next();
                } 
                
           }
   
           c.Desconectar();
       }catch (Exception e){
           e.printStackTrace();
       }
       
        return acpr;
    }
    
    
    public int ObtenerIDUsuario (String email, String pass){
        int n=0;
        try{
            Conexion c = new Conexion();
           ps = c.getConexion().prepareStatement("select idUser "
                   + "from usuario "
                   + "where Email = \""+email+"\" and Contraseña = "+pass);
           rs = ps.executeQuery();
           while(rs.next()){
               n=rs.getInt(1); 
           } 
           c.Desconectar();
       }catch (Exception e){
           e.printStackTrace();
       }
        return n;
    }
    
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_metodos_conexion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author juan-jolo
 */
public class gestion_fechas {
    
        //convertir de java.util.date a string
        public static String obtenerFecha (Date d){
        String fecha = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha=sdf.format(d);
        System.out.println(fecha);
        return fecha;
    }
        
        //convertir de string a java.util.date
    public static Date obtenerFecha(String s) throws ParseException{
        Date d=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        d=sdf.parse(s);
        return d;
    }
    
    public static String FechaActual () {
        Date d = new Date ();
        String fecha = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha=sdf.format(d);
        System.out.println(fecha);
        return fecha;
    }
    
    
}

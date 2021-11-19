/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bbdd;

//import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fernando Martínez
 * www.programaresfacil.co
 */
public class Conexion {
    
    private static Connection com;
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/klaussbrass?serverTimezone=UTC";
    
    public Conexion () {
        com = null;
        try{
            Class.forName(Driver);
            com= DriverManager.getConnection(url, user, password);
            if(com !=null){
                System.out.println("atencion--conexion establecida");
                //JOptionPane.showMessageDialog(null,"conexion establecida","atencion",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (ClassNotFoundException| SQLException e){
            JOptionPane.showMessageDialog(null,"error del tipo "+e,"peligro",JOptionPane.WARNING_MESSAGE);
        }    
    }
    
    public Connection getConexion() {
        return com;
    }
    
    public void Desconectar () {
        com = null;
        if (com == null){
            System.out.println("importante--conexion terminada");
            //JOptionPane.showMessageDialog(null,"conexion terminada","importante",JOptionPane.OK_OPTION);
        }
    }
}

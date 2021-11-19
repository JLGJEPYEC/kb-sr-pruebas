/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogin;

import conexion_bbdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Usuario;

/**
 *
 * @author Luis Fernando Martínez
 * www.programaresfacil.co
 */
public class Login {
    
    
    public Usuario login(String usuario, String password)throws SQLException {
     try {
         Conexion conexion = new Conexion();
         PreparedStatement ps = conexion.getConexion().prepareStatement("SELECT idUser,Nombre1,ApellidoP,tipoUsuario FROM usuario WHERE Email = ? and contraseña = ?");
         ps.setString(1, usuario);
         ps.setString(2, password);
         ResultSet resultado = ps.executeQuery();
//         resultado.last();
         while (resultado.next()){
             // usuarioactual = new Usuario(resultado.getInt("idusuario"),usuario,resultado.getString("titular"),resultado.getString("identificacion"),resultado.getString("tipo_usuario"));
             Usuario usuarioactual = Usuario.getInstance();
             usuarioactual.setId_usuario(Integer.parseInt(resultado.getString(1)));
             usuarioactual.setNombre1(resultado.getString(2));
             usuarioactual.setApellidoP(resultado.getString(3));
             usuarioactual.setTipoUsuario(resultado.getString(4));
             return usuarioactual;
        }
   } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
      return null;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosDAO;

import beans.Usuario;
import beans.conexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author GUASI
 */
public class EliminarUsuariosDao {
    private final String eliminar_Usuarios = "Delete from usuarios where id=?";
    
    public  void EliminarUsuarios(Usuario usuario){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(eliminar_Usuarios);
            ps.setInt(1, usuario.getId());
            ps.executeUpdate();
        } catch (Exception e) {

        }finally{
            conexionDB.close(conn);
        }
    }

}

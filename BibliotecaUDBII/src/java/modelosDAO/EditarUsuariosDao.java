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
public class EditarUsuariosDao {

    private static final String Editar_Usuarios = "Update usuarios set nombre = ?, correo = ?, contrasena = ?, mora = ? where id= ?";

    public void actualizarUsuarios(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String sql = "Update usuarios set nombre = ?, correo = ?, contrasena = ?, mora = ? where id= ?";
            ps = conn.prepareStatement(Editar_Usuarios);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getContrasena());
            ps.setBigDecimal(4, usuario.getMora());
            ps.setInt(5, usuario.getId());
            ps.executeUpdate();
            System.out.println("Datos actualizados correctamente");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conexionDB.close(conn);
        }

    }
}

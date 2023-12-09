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
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author GUASI
 */
public class EnlistarUsuariosDao {

    private final String enlistar_Usuarios = "SELECT id,nombre,correo,contrasena,tipo_usuario,mora FROM usuarios";
    conexionDB Conn;

    public EnlistarUsuariosDao() {
        Conn = new conexionDB();
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        Connection conn = Conn.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ArrayList<Usuario> todos_Usuarios = new ArrayList<>();
            ps = conn.prepareStatement(enlistar_Usuarios);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNombre(rs.getString("nombre"));
                user.setCorreo(rs.getString("correo"));
                user.setContrasena(rs.getString("contrasena"));
                user.setMora(rs.getBigDecimal("mora"));
                todos_Usuarios.add(user);
            }
            return todos_Usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            conexionDB.close(conn);
        }
    }
}

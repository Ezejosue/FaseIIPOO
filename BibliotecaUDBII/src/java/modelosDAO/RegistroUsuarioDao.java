package modelosDAO;

import beans.Usuario;
import beans.conexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author GUASI
 */
public class RegistroUsuarioDao {

    private static final String Insertar_Usuarios_Nuevos = "INSERT INTO `usuarios`  (`nombre`, `correo`, `contrasena`, `tipo_usuario`) VALUES (?, ?, ?, ?)";
    conexionDB Conn;

    public RegistroUsuarioDao() {
        Conn = new conexionDB();
    }

    public boolean ingresarUsuario(Usuario usuario) {
        Connection conn = Conn.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(Insertar_Usuarios_Nuevos);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getContrasena());
            ps.setString(4, usuario.getTipoUsuario());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conexionDB.close(conn);
        }
    }

}

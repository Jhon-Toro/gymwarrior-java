package controladores;

import usuarios.Miembro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MiembroDAO {
    public static void crearMiembro(Miembro miembro) {
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){

            PreparedStatement ps = null;

            try{
                String query = "INSERT INTO Miembro (nombres,apellidos,correo,telefono,contraseña,peso,altura,membresia)VALUES (?,?,?,?,?,?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, miembro.getNombres());
                ps.setString(2, miembro.getApellidos());
                ps.setString(3, miembro.getCorreo());
                ps.setString(4, miembro.getTelefono());
                ps.setString(5,miembro.getPassword());
                ps.setString(6, miembro.getPeso());
                ps.setString(7, miembro.getAltura());
                ps.setString(8, miembro.getTipoMembresia());

                ps.executeUpdate();

                System.out.println("Registro exitoso");
            } catch (SQLException e) {
                System.out.println("Error al registrar el miembro" + e.getMessage());
            }

        }catch(SQLException e){
            System.out.println("Error de conexion" + e.getMessage());
        }
    }
}

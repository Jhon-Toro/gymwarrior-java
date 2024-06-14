package controladores;

import productos.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    public static void crearCategoria(Categoria categoria){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){

            PreparedStatement ps = null;

            try{
                String query = "INSERT INTO categoria (nombreCategoria, descripcionCategoria) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, categoria.getNombreCategoria());
                ps.setString(2, categoria.getDescripcionCategoria());
                ps.executeUpdate();

                System.out.println("Registro de categoria exitoso");
            } catch (SQLException e){
                System.out.println("Error al registrar el categoria" + e.getMessage());
            }
        } catch (SQLException e){
            System.out.println("Error de conexión" + e.getMessage());
        }
    }

    public static void seleccionarCategoria(Categoria categoria){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){
            PreparedStatement ps = null;
            ResultSet rs = null;

            try{
                String query = "SELECT * FROM categoria";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();

                while(rs.next()){
                    System.out.println("Id: " + rs.getInt("id_categoria"));
                    System.out.println("Categoria : " + rs.getString("nombreCategoria"));
                    System.out.println("Descripcion : " + rs.getString("descripcionCategoria"));

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("No se pudo recuperar las categorias");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void eliminarCategoria(Categoria categoria, int idCategoria){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM categoria WHERE id_categoria = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idCategoria);
                int rows = ps.executeUpdate();
                if(rows > 0){
                    System.out.println("Categoria eliminada exitosamente");
                } else {
                    System.out.println("No se encontró ninguna categoria con el ID proporcionado");
                }
            }catch (SQLException e){}
        }catch(SQLException e){}
    }

    public static void actualizarCategoria(Categoria categoria, int idCategoria){
        Conexion conexion = new Conexion();

        try(Connection connection = conexion.getConnect()){
            PreparedStatement ps = null;

            try{
                String query = "UPDATE categoria SET nombreCategoria = ?, descripcionCategoria = ? WHERE id_categoria = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, categoria.getNombreCategoria());
                ps.setString(2, categoria.getDescripcionCategoria());
                ps.setInt(3, idCategoria);
                int rows = ps.executeUpdate();
                if(rows > 0){
                    System.out.println("Categoria actualizada exitosamente");
                } else {
                    System.out.println("No se encontro ninguna categoria con esa ID");
                }
            }catch (SQLException e){
                System.out.println("Error al actualizar la categoria" + e.getMessage());
            }
        }catch(SQLException e){
            System.out.println("Error de conexión" + e.getMessage());
        }
    }
}

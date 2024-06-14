package controladores;

import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) throws SQLException {
        Conexion con = new Conexion();
        con.getConnect();
    }
}

package controladores;

import productos.Categoria;

import java.sql.SQLException;

public class TestCategoria {
    public static void main(String[] args){
        Categoria cat1 = new Categoria();
        CategoriaService cat2 = new CategoriaService();

        cat2.listarCategorias(cat1);
        cat2.actualizarCategoria(cat1);
    }
}

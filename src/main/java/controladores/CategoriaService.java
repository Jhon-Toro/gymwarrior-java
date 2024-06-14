package controladores;

import productos.Categoria;

import java.sql.SQLException;
import java.util.Scanner;

public class CategoriaService {
    Scanner sc = new Scanner(System.in);
    public void crearCategoria(Categoria categoria){
        System.out.println("Nombre de la categoria: ");
        String nombreCategoria = sc.nextLine();
        categoria.setNombreCategoria(nombreCategoria);
        System.out.println("Descripción: ");
        String descripcionCategoria = sc.nextLine();
        categoria.setDescripcionCategoria(descripcionCategoria);

        CategoriaDAO.crearCategoria(categoria);
    }

    public void listarCategorias(Categoria categoria){
        CategoriaDAO.seleccionarCategoria(categoria);
    }

    public void eliminarCategoria(Categoria categoria){
        System.out.println("Ingrese el ID de la categoría que desea eliminar:");
        int idCategoria = sc.nextInt();

        CategoriaDAO.eliminarCategoria(categoria, idCategoria);
    }

    public void actualizarCategoria(Categoria categoria){
        System.out.println("Ingresa el ID de la categoria que desea actualizar:");
        int idCategoria = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre de la categoria: ");
        String nuevoNombre = sc.nextLine();
        System.out.println("Descripcion: ");
        String nuevaDescripcion = sc.nextLine();

        categoria.setNombreCategoria(nuevoNombre);
        categoria.setDescripcionCategoria(nuevaDescripcion);
        CategoriaDAO.actualizarCategoria(categoria, idCategoria);
    }
}

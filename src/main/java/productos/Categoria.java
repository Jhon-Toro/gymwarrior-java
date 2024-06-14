package productos;

import java.util.Scanner;

public class Categoria {
    Scanner sc = new Scanner(System.in);
    // 1. Atributos
    private String nombreCategoria;
    private String descripcionCategoria;

    // 2. Constructor
    public Categoria() {}

    public Categoria(String nombreCategoria, String descripcionCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    // 3. Getters and Setters


    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    // 4. Metodos

    public void seleccionarCategoria(){}

    public void actualizarCategoria(){}

    public void eliminarCategoria(){}
}

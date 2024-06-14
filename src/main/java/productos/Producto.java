package productos;

import helpers.ValidaProducto;

import java.util.Scanner;

public class Producto {
    Scanner sc = new Scanner(System.in);
    // 1. Atributos

    private String producto;
    private double costo;
    private double margenGanancia;
    private double precio;
    private int cantidad;
    Categoria categoria;

    // 2. Constructor
    public Producto() {}

    public Producto(String producto, double costo, double margenGanancia, double precio, int cantidad) {
        this.producto = producto;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // 3. Getters and Setters


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // 4. Metodos

    public void crearProducto(){
        System.out.println("Nombre del producto: ");
        producto = sc.nextLine();
        while(true){
            System.out.println("Ingrese el costo del producto: ");
            String costoStr = sc.nextLine();
            costoStr = costoStr.replaceAll(",", ".");
            if (ValidaProducto.validarCosto(costoStr)){
                costo = Double.parseDouble(costoStr);
                break;
            } else {
                System.out.println("Error, Debes ingresar solo Numeros con Punto");
                System.out.println("Ej: 100.000 o 100,000");
            }
        }

        while(true){
            System.out.println("Ingrese el precio del producto: ");
            String precioStr = sc.nextLine();
            precioStr = precioStr.replaceAll(",", ".");
            if (ValidaProducto.validarCosto(precioStr)) {
                precio = Double.parseDouble(precioStr);
                break;
            } else {
                System.out.println("Error, Debes ingresar solo Numeros con Punto");
                System.out.println("Ej: 100.000 o 100,000");
            }
        }

        while(true){
            System.out.println("Ingrese la margen de ganacia del producto: ");
            String margenGananciaStr = sc.nextLine();
            margenGananciaStr = margenGananciaStr.replaceAll(",", ".");
            if (ValidaProducto.validarCosto(margenGananciaStr)) {
                margenGanancia = Double.parseDouble(margenGananciaStr);
                break;
            } else {
                System.out.println("Error, Debes ingresar solo Numeros con Punto");
                System.out.println("Ej: 100.000 o 100,000");
            }
        }


        while(true){
            System.out.println("Ingrese la cantidad");
            String cantidadStr = sc.nextLine();
            if (ValidaProducto.validarCantidad(cantidadStr)) {
                cantidad = Integer.parseInt(cantidadStr);
                break;
            } else {
                System.out.println("Digite un número valido, Sin comas ni letras");
            }
        }
    }

    public void seleccionarProducto(){
        System.out.println("Nombre producto : " + producto);
        System.out.println("Precio : " + precio);
        System.out.println("Cantidad : " + cantidad);
        String nombreCategoria = categoria.getNombreCategoria();
    }
}

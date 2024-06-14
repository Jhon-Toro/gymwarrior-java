package clases;

public class Clase {
    // 1. Atributos
    private int idClase;
    private String nombreClase;
    private int idEntrenador;
    private int idMiembro;

    // 2. Metodos

    public Clase(){}

    public Clase(int idClase, String nombreClase, int idEntrenador, int idMiembro) {
        this.idClase = idClase;
        this.nombreClase = nombreClase;
        this.idEntrenador = idEntrenador;
        this.idMiembro = idMiembro;
    }

    // 4. Getters and Setters


    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }
}

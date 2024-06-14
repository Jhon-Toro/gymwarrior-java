package usuarios;

import helpers.ValidaMiembro;

import java.util.Scanner;

public class Entrenador extends Usuario{
    Scanner sc = new Scanner(System.in);
    // 1. Atributos
    private String peso;
    private String altura;
    private String especialidad;

    // 2. Constructor vacio y lleno

    public Entrenador() {}

    public Entrenador(String nombres, String apellidos, String correo, String genero, String telefono, String password, String peso, String altura, String especialidad) {
        super(nombres, apellidos, correo, genero, telefono, password);
        this.peso = peso;
        this.altura = altura;
        this.especialidad = especialidad;
    }

    // 3. Getters and Setters


    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // 4. Metodos


    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("Creando perfil de Entrenador");
        while (true){
            System.out.println("¿Cuánto pesas? : ");
            peso = sc.nextLine();
            if (ValidaMiembro.validarPeso(peso)){
                this.peso = peso;
                break;
            } else {
                System.out.println("Caracteres invalidos, EJ: '68.8'");
            }
        }
        while (true){
            System.out.println("¿ Cuánto mides ? :");
            altura = sc.nextLine();
            if (ValidaMiembro.validarAltura(altura)){
                this.altura = altura;
                break;
            } else {
                System.out.println("Caracteres invalidos, EJ: '1.86'");
            }
        }

        System.out.println("¿ En qué te especializas ?");
        especialidad = sc.nextLine();
    }

    @Override
    public void seleccionarUsuario() {
        super.seleccionarUsuario();
    }

    @Override
    public void actualizarUsuario() {
        super.actualizarUsuario();
    }

    @Override
    public void eliminarUsuario() {
        super.eliminarUsuario();
    }
}

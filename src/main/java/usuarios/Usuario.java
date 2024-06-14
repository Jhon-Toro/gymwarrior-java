package usuarios;

import helpers.ValidaUsuario;

import java.util.Scanner;

public abstract class Usuario implements UtilUsuario{
    Scanner sc = new Scanner(System.in);
    // 1. Atributos
    private String nombres;
    private String apellidos;
    private String correo;
    private String genero;
    private String telefono;
    private String password;

    // 2. Constructores
    public Usuario() {}

    public Usuario(String nombres, String apellidos, String correo, String genero, String telefono, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.genero = genero;
        this.telefono = telefono;
        this.password = password;
    }

    // 3. Getters and Setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // 4. Metodos propios

    public void crearUsuario(){
        while (true){
            System.out.println("Nombres : ");
            nombres = sc.nextLine();
            if (ValidaUsuario.validarNombres(nombres)){
                this.correo = correo;
                break;
            } else {
                System.out.println("Introduce tus nombres correctamente");
            }
        }

        while (true){
            System.out.println("Apellidos : ");
            apellidos = sc.nextLine();
            if (ValidaUsuario.validarApellidos(apellidos)){
                this.apellidos = apellidos;
                break;
            } else {
                System.out.println("Introduce tus apellidos correctamente");
            }
        }

        while (true){
            System.out.println("Correo : ");
            correo = sc.nextLine();
            if (ValidaUsuario.validarCorreo(correo)){
                this.correo = correo;
                break;
            } else {
                System.out.println("El correo no cumple con las condiciones");
            }
        }

        while (true){
            System.out.println("Genero : ");
            genero = sc.nextLine();
            if (ValidaUsuario.validarGenero(genero)){
                this.genero = genero;
                break;
            } else {
                System.out.println("Debes introducir 'Masculino' o 'Femenino");
            }
        }

        while (true){
            System.out.println("Telefono :");
            telefono = sc.nextLine();
            if (ValidaUsuario.validarTelefono(telefono)){
                this.telefono = telefono;
                break;
            } else {
                System.out.println("Debes introducir Tú numero de telefono de 10 Dígitos");
            }
        }

        System.out.println("Contraseña : ");
        password = sc.nextLine();
    }

    public void actualizarUsuario(){}

    public void seleccionarUsuario(){
        System.out.println("Sus datos son: ");
        System.out.println("Nombres : " + nombres);
        System.out.println("Apellidos : " + apellidos);
        System.out.println("Correo : " + correo);
        System.out.println("Genero : " + genero);
        System.out.println("Telefono : " + telefono);
        System.out.println("Contraseña : " + password);
    }


    public void eliminarUsuario(){}
}

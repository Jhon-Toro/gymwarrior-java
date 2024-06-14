package usuarios;

import helpers.ValidaMiembro;

import java.util.Scanner;

public class Miembro extends Usuario{
    Scanner sc = new Scanner(System.in);
    // 1. Atributos

    private String peso;
    private String altura;
    private String tipoMembresia;

    // 2. Contructor

    public Miembro(){}

    public Miembro(String nombres, String apellidos, String correo, String genero, String telefono, String password, String peso, String altura, String tipoMembresia) {
        super(nombres, apellidos, correo, genero, telefono, password);
        this.peso = peso;
        this.altura = altura;
        this.tipoMembresia = tipoMembresia;
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

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    // 4. Metodos


    @Override
    public void crearUsuario() {
        super.crearUsuario();
        System.out.println("Creando perfil de Miembro");
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

        while (true){
            System.out.println("Tipo de membresia : ");
            tipoMembresia = sc.nextLine();
            if (ValidaMiembro.validarMembresia(tipoMembresia)){
                this.tipoMembresia = tipoMembresia;
                break;
            } else {
                System.out.println("Caracteres invalidos, Usar 'Bronce', 'Vip' o 'Gold'");
            }
        }
    }

    @Override
    public void seleccionarUsuario() {
        super.seleccionarUsuario();
        System.out.println("Peso :" + peso);
        System.out.println("Altura :" + altura);
        System.out.println("Tipo de membresia : " + tipoMembresia);
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

package controladores;

import helpers.ValidaMiembro;
import helpers.ValidaUsuario;
import usuarios.Miembro;

import java.util.Scanner;

public class MiembroService {
    Scanner sc = new Scanner(System.in);
    private String nombres;
    private String apellidos;
    private String correo;
    private String genero;
    private String telefono;
    private String password;
    private String peso;
    private String altura;
    private String tipoMembresia;

    public void crearMiembro(Miembro miembro2) {  // Quitamos el parámetro Miembro miembro
        while (true) {
            System.out.println("Nombres : ");
            nombres = sc.nextLine();
            if (ValidaUsuario.validarNombres(nombres)) {
                break;
            } else {
                System.out.println("Introduce tus nombres correctamente");
            }
        }

        while (true) {
            System.out.println("Apellidos : ");
            apellidos = sc.nextLine();
            if (ValidaUsuario.validarApellidos(apellidos)) {
                break;
            } else {
                System.out.println("Introduce tus apellidos correctamente");
            }
        }

        while (true) {
            System.out.println("Correo : ");
            correo = sc.nextLine();
            if (ValidaUsuario.validarCorreo(correo)) {
                break;
            } else {
                System.out.println("El correo no cumple con las condiciones");
            }
        }

        while (true) {
            System.out.println("Genero : ");
            genero = sc.nextLine();
            if (ValidaUsuario.validarGenero(genero)) {
                break;
            } else {
                System.out.println("Debes introducir 'Masculino' o 'Femenino'");
            }
        }

        while (true) {
            System.out.println("Telefono :");
            telefono = sc.nextLine();
            if (ValidaUsuario.validarTelefono(telefono)) {
                break;
            } else {
                System.out.println("Debes introducir Tú numero de telefono de 10 Dígitos");
            }
        }

        System.out.println("Creando perfil de Miembro");
        while (true) {
            System.out.println("¿Cuánto pesas? : ");
            peso = sc.nextLine();
            if (ValidaMiembro.validarPeso(peso)) {
                break;
            } else {
                System.out.println("Caracteres invalidos, EJ: '68.8'");
            }
        }
        while (true) {
            System.out.println("¿ Cuánto mides ? :");
            altura = sc.nextLine();
            if (ValidaMiembro.validarAltura(altura)) {
                break;
            } else {
                System.out.println("Caracteres invalidos, EJ: '1.86'");
            }
        }

        while (true) {
            System.out.println("Tipo de membresia : ");
            tipoMembresia = sc.nextLine();
            if (ValidaMiembro.validarMembresia(tipoMembresia)) {
                break;
            } else {
                System.out.println("Caracteres invalidos, Usar 'Bronce', 'Vip' o 'Gold'");
            }
        }

        System.out.println("Contraseña : ");
        password = sc.nextLine();

        Miembro miembro = new Miembro(nombres, apellidos, correo, genero, telefono, password, peso, altura, tipoMembresia);

        MiembroDAO.crearMiembro(miembro);
    }
}

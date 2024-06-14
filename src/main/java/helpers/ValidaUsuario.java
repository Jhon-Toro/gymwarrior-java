package helpers;

import java.util.regex.Pattern;

public class ValidaUsuario {
    private static final String NOMBRES_REGEX = "^[a-zA-ZÁÉÍÓÚáéíóúÑñ ]+$";
    private static final String APELLIDOS_REGEX = "^[a-zA-ZÁÉÍÓÚáéíóúÑñ ]+$";
    private static final String CORREO_REGEX = "^[a-zA-Z0-9-_.]+@[a-zA-Z0-9-_]+(\\.[a-zA-Z]{2,4}){1,2}$";
    private static final String GENERO_REGEX = "^(?i)(Femenino|Masculino)$";
    private static final String TELEFONO_REGEX = "^([0-9]{10})$";

    private static final Pattern nombresPattern = Pattern.compile(NOMBRES_REGEX);
    private static final Pattern apellidosPattern = Pattern.compile(APELLIDOS_REGEX);
    private static final Pattern correoPattern = Pattern.compile(CORREO_REGEX);
    private static final Pattern generoPattern = Pattern.compile(GENERO_REGEX);
    private static final Pattern telefonoPattern = Pattern.compile(TELEFONO_REGEX);


    public static boolean validarNombres(String nombres) { return nombresPattern.matcher(nombres).matches(); }
    public static boolean validarApellidos(String apellidos) { return apellidosPattern.matcher(apellidos).matches(); }
    public static boolean validarCorreo(String correo) { return correoPattern.matcher(correo).matches(); }
    public static boolean validarGenero(String genero) { return generoPattern.matcher(genero).matches(); }
    public static boolean validarTelefono(String telefono) { return telefonoPattern.matcher(telefono).matches(); }

}

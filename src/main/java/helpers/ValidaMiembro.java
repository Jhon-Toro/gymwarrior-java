package helpers;

import java.util.regex.Pattern;

public class ValidaMiembro {
    private static final String PESO_REGEX = "\\d{1,3}(?:\\.\\d{1,2})?";
    private static final String ALTURA_REGEX = "^\\d\\.\\d{2}$";
    private static final String MEMBRESIA_REGEX = "^(?i)(Bronce|Vip|Gold)$";

    private static final Pattern pesoPattern = Pattern.compile(PESO_REGEX);
    private static final Pattern alturaPattern = Pattern.compile(ALTURA_REGEX);
    private static final Pattern membresiaPattern = Pattern.compile(MEMBRESIA_REGEX);

    public static boolean validarPeso(String peso) { return pesoPattern.matcher(peso).matches(); }
    public static boolean validarAltura(String altura) { return alturaPattern.matcher(altura).matches(); }
    public static boolean validarMembresia(String membresia) { return membresiaPattern.matcher(membresia).matches(); }

}

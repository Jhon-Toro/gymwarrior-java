package helpers;

import java.util.regex.Pattern;

public class ValidaProducto {
    private static String COSTO_REGEX = "[0-9]{1,3}(\\.[0-9]{3})*";
    private static String MARGEN_REGEX = "[0-9]{1,3}(\\.[0-9]{3})*";
    private static String PRECIO_REGEX = "[0-9]{1,3}(\\.[0-9]{3})*";
    private static String CANTIDAD_REGEX = "^-?\\d+$\n";

    private static final Pattern costoPattern = Pattern.compile(COSTO_REGEX);
    private static final Pattern margenPattern = Pattern.compile(MARGEN_REGEX);
    private static final Pattern precioPattern = Pattern.compile(PRECIO_REGEX);
    private static final Pattern cantidadPattern = Pattern.compile(CANTIDAD_REGEX);

    public static boolean validarCosto(String costo) { return costoPattern.matcher(costo).matches(); }
    public static boolean validarMargen(String margenGanancia) { return costoPattern.matcher(margenGanancia).matches(); }
    public static boolean validarPrecio(String precio) { return costoPattern.matcher(precio).matches(); }
    public static boolean validarCantidad(String cantidad) { return costoPattern.matcher(cantidad).matches(); }
}

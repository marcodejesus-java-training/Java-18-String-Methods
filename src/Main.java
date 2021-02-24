import java.util.Locale;

public class Main {
    public static void main(String args[]){
        String mensajeFinalDeCompra = "  Tu pedido en Amazon está completo.  ";
        System.out.println("CADENA ORIGINAL: " + mensajeFinalDeCompra);
        System.out.println();

        System.out.println("Identificador de la Cadena: " + mensajeFinalDeCompra.hashCode());
        System.out.println("Longitud de la Cadena: " + mensajeFinalDeCompra.length());
        System.out.println();

        // Posicionamiento de Caracteres
        System.out.println("Posición/Índice de la primera letra 'e' en la Cadena: " + mensajeFinalDeCompra.indexOf('e'));
        System.out.println("Posición/Índice de la palabra 'Amazon': " + mensajeFinalDeCompra.indexOf("Amazon"));
        System.out.println("Posición/Índice de la palabra 'completo': " + mensajeFinalDeCompra.indexOf("completo", 21));
        System.out.println("Posición/Índice de la última letra 'e' en la Cadena: " + mensajeFinalDeCompra.lastIndexOf("e", 34));
        System.out.println("Subcadena de la Cadena: " + mensajeFinalDeCompra.substring(27, 35));
        System.out.println("Letra de la Cadena en la posición 17: " + mensajeFinalDeCompra.charAt(17));
        System.out.println();

        // Modificación de la Cadena
        System.out.println("Cadena sin espcios al incio o al final: " + mensajeFinalDeCompra.trim());
        System.out.println("Cadena con espacios intercambiados con un guión: " + mensajeFinalDeCompra.replace(" ", "-"));
        System.out.println("Cadena con texto añadido: " + mensajeFinalDeCompra.concat("Muchas gracias por tu compra!"));
        System.out.println("Cadena en Minúsculas: " + mensajeFinalDeCompra.toLowerCase());
        System.out.println("Cadena en Mayúsculas: " + mensajeFinalDeCompra.toUpperCase());
        System.out.println();

        // Verificacion del Contenido
        System.out.println("Verificamos si la Cadena contiene la palabra 'Amazon': " + mensajeFinalDeCompra.contains("Amazon"));
        System.out.println("Verificamos si la Cadena termina con un punto: " + mensajeFinalDeCompra.endsWith("."));
        System.out.println("Verificamos si la Cadena está vacía: " + mensajeFinalDeCompra.isEmpty());
        System.out.println("Verificamos si la Cadena empieza con un espacio: " + mensajeFinalDeCompra.startsWith(" "));

        // Encadenamiento de Métodos
        System.out.println(mensajeFinalDeCompra.replace(" ", " * ").trim().concat(" Vuelve Pronto!"));
    }
}

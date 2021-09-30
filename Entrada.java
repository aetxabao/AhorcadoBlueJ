import java.util.Scanner;

/**
 * Para leer los caracteres introducidos por teclado.
 */
public class Entrada {
    
    /**
     * Es necesario pulsar Enter tras escribir una letra.
     */
    public char leerCaracter() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        return str.charAt(0);
    }
    
}
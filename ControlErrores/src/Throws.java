import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        // Diferencia entre throw y throws
        // throw: Se utiliza para lanzar una excepción específica en el método actual
        // throws: Se utiliza para declarar que un método puede lanzar una excepción específica
        try {
           leerNumero();
       } catch (NameFormatException e) {
           e.printStackTrace();
       }
    }

    /**
     * Metodo que lee nombre de consola y verifica que longitud
     * igual o menos a 8 caracteres.
     * throws NameFormatException
     * */
    private static void leerNumero() throws NameFormatException {
       Scanner teclado = new Scanner(System.in); // Para entrada de cadena por consola
        System.out.print("Ingresar nombre: ");

        while(teclado.hasNext()){ // hasNext() devuelve true si hay un token siguiente en el flujo de entrada
            String nombre = teclado.next();

            if(nombre.length() > 8){
                teclado.close();
                throw new NameFormatException("Nombre no debe tener mas de 8 caracteres");
            }
            System.out.println("Nombre: " + nombre);
            System.out.print("Ingresar nombre: ");
        }
        teclado.close();
    }
}

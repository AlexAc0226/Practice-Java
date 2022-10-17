// Que significa static: http://www.javatpoint.com/static-keyword-in-java

public class Tips {
    public static void main(String[] args) {
        // Tipos de datos

        // Enteros
        byte n1 = 3; // 1 byte
        short n2 = 5; // 2 bytes
        int n3 = 6; // 4 bytes
        long n4 = 7; // 8 bytes

        // Punto flotante
        float n5 = 4.9f;
        double n6 = 4.99d;

        // Cadenas
        char cadena1 = 'a';

        // Booleanos
        boolean booleano1 = true;

        // Cadena de texto
        String cadena3 = "hola Alex";

        // Tipos envoltorio
        // int numero = null  ---> Esto esta mal y daria un error
        Integer envol = null;

        // funcion para crear una cadena de texto
        String cadena = String.format("El numero es %d", n1);

        // Imprimir en consola
        mostrar("Texto a la funcion mostrar");
        int resultadoFuncion = sumar(5,6);
        System.out.println(resultadoFuncion);
    }

    private static String mostrar(String texto) {
        System.out.println(texto);
        return texto;
    }

    private static int sumar(int a, int b) {
        return a + b;
    }
}

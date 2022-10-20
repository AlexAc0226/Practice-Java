public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            // Aqui va el codigo que puede llegar a dar problemas
            int result = 5 / 0;

        } catch (ArithmeticException e) {
            // Aqui van las acciones a tomar si se genera o se captura una excepcion del tipo especificado
            e.printStackTrace(); // Sirve para mostrar donde ocurre el error
        } finally {     //Este finally solo se va a ejecutar siempre y cuando el catch halla ejecutado.
            // Se ejecuta diferentes acciones independientemente de si acaba en error o no el try.
            // Por ejemplo, cerrar el archivo o cerrar una conexion a la base de datos, liberar recursos.
            System.out.println("Cierre de recursos");
        }

        System.out.println("Programa finalizado");
    }
}

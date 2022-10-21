public class NameFormatException extends Exception {
    private static final long serialVersionUID = 1L; // Serializa clase por defecto para una mejor compatibilidad entre dispositivos al leer archivos

    public NameFormatException(String errorMessage){
        super(errorMessage);
    }
}

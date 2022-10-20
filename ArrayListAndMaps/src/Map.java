public class Map {
    public static void main(String[] args) {

        java.util.Map<String, String> names = new java.util.HashMap<>();

        names.put("ID123", "Nombre 1");
        names.put("ID456", "Nombre 2");

        // for (String key : names.keySet()) System.out.println(key); // Imprimr keys
        // for (String value : names.values()) System.out.println(value); // Imprimr value

        // Key + Value
        for (java.util.Map.Entry<String, String> entries : names.entrySet()) {
            String key = entries.getKey(); // Imprimr keys
            String value = entries.getValue(); // Imprimr value
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}

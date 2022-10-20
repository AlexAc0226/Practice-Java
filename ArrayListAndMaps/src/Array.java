public class Array {
    public static void main(String[] args) {
        // IMPORTANTE: Los array son estructuras estadicas, es decir que una ves declara su tamaño, se mantendra siempre de ese tamaño.


        String name1 = "Gergő";
        String name2 = "Tom";
        String name3 = "Stacey";

        String[] names = new String[3];
        String[] names2 = new String[]{ name1, name2, name3 };

        int[] numbers = new int[3];

        Coche[] garage = new Coche[2];

        for (int i = 0; i < names.length; i++) {
            names[i] = "Nombre " + (i + 1);
            numbers[i] = i + 1;
        }

        for (String s : names)  System.out.println(s);
        for (String s : names2)  System.out.println(s);


    }
}

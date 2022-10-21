public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Para entrada de cadena por consola

        System.out.print("Added a name: ");
        String name = scanner.nextLine();
        System.out.println("Hello ".concat(name));

        System.out.print("Added a number: ");
        int number = scanner.nextInt();
        System.out.println("The number is: ".concat(String.valueOf(number)));

    }
}

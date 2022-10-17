public class Main {
    public static void main(String[] args)
    {
         int[] ns = new int[3];
         for (int i = 0; i < ns.length; i++)
         {
                System.out.println("Numero: " + i);
         }
    }


    public static void cadenaMain()
    {
        System.out.println("Hello desde Main!");
    }

    // Sobrecarga de funcion de sumar
    public static int sumar(int a, int b)
    {
        return a + b;
    }
    public static int sumar(int a, int b, int c)
    {
        return a + b + c;
    }



}
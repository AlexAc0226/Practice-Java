package com.gaming;

public class Hardware {
    public static void main(String[] args)
    {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println("Numero: " + i);
        }
    }

    public static void cadenaHardware()
    {
        System.out.println("Estamos en el paquete gaming, clase Hardware!");
    }
}

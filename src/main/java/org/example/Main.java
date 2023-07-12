package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        // Primer ejercicio propuesto clase 2 ( e:1 c:2)
        String name;
        int age;

        System.out.print("Ingrese su nombre: ");
        name = keyboardInput.next();
        System.out.print("Ingrese su edad: ");
        age = keyboardInput.nextInt();

        System.out.println("Hola, "+name+". Tienes "+ age+" años.");
    }
}
package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        // Segundo ejercicio propuesto - clase 2 ( e:2 c:2)
        int numberGiven;
        double squareRoot;

        System.out.print("Ingrese un número entero: ");
        numberGiven = keyboardInput.nextInt();
        squareRoot = Math.sqrt((double)numberGiven);


        System.out.println("La raíz cuadrada de "+ numberGiven+" es: "+ String.format("%.2f", squareRoot));


        // Primer ejercicio propuesto - clase 2 ( e:1 c:2)
        /*String name;
        int age;

        System.out.print("Ingrese su nombre: ");
        name = keyboardInput.next();
        System.out.print("Ingrese su edad: ");
        age = keyboardInput.nextInt();

        System.out.println("Hola, "+name+". Tienes "+ age+" años.");*/
    }
}
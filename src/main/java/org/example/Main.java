package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        // Quinto ejercicio  - clase 2 (e:5 c:2)
        String stringNumber;
        double doubleNumber;

        System.out.print("Ingrese un número decimal: ");
        stringNumber = keyboardInput.next();
        doubleNumber = Double.parseDouble(stringNumber);

        System.out.println("El valor decimal es: "+ doubleNumber);

        // Cuarto ejercicio - clase 2 (e:4 c:2)
        /*String stringNumber;
        float floatNumber;

        System.out.print("Ingrese un número decimal: ");
        stringNumber = keyboardInput.next();
        floatNumber = Math.round(Float.parseFloat(stringNumber));

        System.out.println("El valor redondeado a entero es: "+ floatNumber);*/

        // Tercer ejercicio propuesto - clase 2 ( e:3 c:2 )
       /* String stringNumber;
        int intNumber;

        System.out.print("Ingrese un número entero: ");
        stringNumber = keyboardInput.next();
        intNumber = Integer.parseInt(stringNumber);

        System.out.println("El valor parseado a entero es: "+ intNumber);*/

        // Segundo ejercicio propuesto - clase 2 ( e:2 c:2 )
        /*int numberGiven;
        double squareRoot;

        System.out.print("Ingrese un número entero: ");
        numberGiven = keyboardInput.nextInt();
        squareRoot = Math.sqrt(numberGiven);


        System.out.println("La raíz cuadrada de "+ numberGiven+" es: "+ String.format("%.2f", squareRoot));*/


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
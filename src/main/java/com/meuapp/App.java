package com.meuapp;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextFloat();
        // System.out.println(value1 + " + " + 5 + " = " + (value1 + 5));
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
    }
}

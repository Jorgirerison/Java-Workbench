package com.meuapp;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        // while(true) {
        //     System.out.println("Informe um nome: ");
        //     name = scanner.next();
        //     System.out.println(name);

        //     if (name.equalsIgnoreCase("exit")) break;
        // }

        // do while
        name = "exit";
        do {
             System.out.println("Informe um nome: ");
             name = scanner.next();
             System.out.println(name);
        } while (!name.equalsIgnoreCase("exit")); // exit
    }

}

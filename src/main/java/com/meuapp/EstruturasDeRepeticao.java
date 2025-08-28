package com.meuapp;

import java.util.Scanner;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // for com comparação de string
        // for (;;) {
        //     System.out.println("Digite um nome: ");
        //     var name = scanner.next();
        //     if (name.equalsIgnoreCase("exit")) break;
        //     // basta digitar sout para ter o 
        //     // comando abaixo disponível mais
        //     // fácil
        //     System.out.println(name); 
        // }

        // for com uso da keyword continue
        // for (int i = 0; i < 100; i++) {
        //    if (i % 2 == 0) {
        //         continue;
        //     }
        //     
        //     // pritando apenas os impares
        //     System.out.println(i);
        // }

        // for com uso do args
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        //     
        // }

        for (var arg : args) {
            System.out.println(arg); 
        }
    }
}

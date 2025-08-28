package com.meuapp;

import java.util.Scanner;

public class Exercicios {

   public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var nome = scanner.next();
        System.out.println("Qual seu ano de nascimento?");
        var ano = scanner.nextInt();
        var idade = 2025 - ano;
        System.out.printf("Olá %s vocẽ tem %s anos de idade\n", nome, idade);

    
   }
}

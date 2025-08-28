package com.meuapp;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 7");
        var option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

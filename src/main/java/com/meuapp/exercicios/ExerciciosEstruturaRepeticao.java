package com.meuapp.exercicios;

import java.util.Scanner;

public class ExerciciosEstruturaRepeticao {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // System.out.println("Digite um número para verificar a tabuada.");
        // var numEscolhido = scanner.nextInt();
        // for (int i = 0; i <= 10; i++) {
        //     System.out.printf("%s x %s = %s\n", numEscolhido, i, numEscolhido*i);
        // }
        //
        // imc
        System.out.println("Digite a sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Digite o seu peso: ");
        var peso = scanner.nextFloat();
        var imc = peso/(altura*altura);
        System.out.printf("IMC = %s\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if((imc >= 18.6) & (imc <= 24.9)) {
            System.out.println("Peso ideal");
        } else if((imc >= 25) & (imc <= 29.9)) {
            System.out.println("Levemente acima do peso");
        } else if((imc >= 30) & (imc <= 34.9)) {
            System.out.println("Obesidade Grau I");
        } else if((imc >= 35) & (imc <= 39.9)) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }

}

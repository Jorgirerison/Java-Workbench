package com.meuapp;

public class IfElse {

    public static void main(String[] args) {
        var num = 3;
        var num_validador = 4;
        var condicional = num > num_validador;

        // 1 linha de código
        // if (condicional) System.out.printf("%s é maior que %s\n", num, num_validador);

        // + linhas de código
        // if (condicional) {
        //     System.out.printf("%s é maior que %s\n", num, num_validador);
        // } else if (num == num_validador){
        //     System.out.printf("%s é igual a %s\n", num, num_validador);
        // } else {
        //     System.out.printf("%s é menor que %s\n", num, num_validador);
        // }

        // Elvis Operator ?:
        var message = condicional?
            System.out.printf("%s é maior que %s\n", num, num_validador):
            System.out.printf("%s é menor que %s\n", num, num_validador);
            
    }
}

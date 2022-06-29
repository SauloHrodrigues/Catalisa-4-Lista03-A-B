package lista03_A.exercicio05;

import java.util.Scanner;

/*
*   Exercicio 05 - Faça um Programa que receba um número e exiba o dia correspondente da semana.
*   (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido.
* */

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("\n ************* DIA DA SEMANA ************\n");
        int diaSemana;
        boolean op = true;
       // while (op == true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero de 1 à 7 : ");
            diaSemana = input.nextInt();
            input.close();
            switch (diaSemana) {
                case 1:
                    System.out.printf("Você digitou %d - domingo", diaSemana);
                    op= false;
                    break;
                case 2:
                    System.out.printf("Você digitou %d - segunda-feira", diaSemana);
                    op= false;
                    break;
                case 3:
                    System.out.printf("Você digitou %d - terça-feira", diaSemana);
                    op= false;
                    break;
                case 4:
                    System.out.printf("Você digitou %d - quarta-feira", diaSemana);
                    op= false;
                    break;
                case 5:
                    System.out.printf("Você digitou %d - quinta-feira", diaSemana);
                    op= false;
                    break;
                case 6:
                    System.out.printf("Você digitou %d - sexta-feira", diaSemana);
                    op= false;
                    break;
                case 7:
                    System.out.printf("Você digitou %d - sábado", diaSemana);
                    op= false;
                    break;
                default:
                    System.out.println("Valor Inválido!");
            //}
        }
    }
}

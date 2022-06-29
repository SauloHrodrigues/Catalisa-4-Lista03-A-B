package lista03_B.exercicio02_B;

import java.util.Scanner;

//Exercicio 02 - Faça um programa que leia n números inteiros e imprima sua média.
public class Exercicio02_B {
    public static void main(String[] args) {
        int num = 0;
        float cont = 1;
        float media;
        String verificacao = "s";
        boolean controle = true;
        Scanner imput = new Scanner(System.in);
        System.out.printf("\n************** MÉDIA DE N NÚMEROS *******************\n\n");
        while (controle) { // isso é uma gambiarra
            System.out.print("Entre com um númerto para compor a média: ");
            num += imput.nextInt();

                System.out.print("Deseja entrar com outro numero s/n: ");
                verificacao = imput.next();
                if (verificacao.equalsIgnoreCase("n")) {
                    controle = false;
                } else {
                    cont++;
                }
        }
        imput.close();
        media = num / cont;
        System.out.printf("A média dos números digitados é: %.2f", media);

    }
}

package lista03_A.exercicio01;

import java.util.Scanner;

    /*
    * Exercicio 01 - Faça um programa que receba dois números e imprima o maior deles.
    */

public class Exercico01 {
    public static void main(String[] args) {
        System.out.printf("\n--------------- MAIOR DE 2 NÚMEROS ---------------\n");
        int numero=0;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.printf("Digite o ¨%d° número: ",i+1);
            int aux =input.nextInt();
            if(aux>numero){
                numero = aux;
            }
        }
        System.out.printf("O número %d é maior!",numero);
    }
}

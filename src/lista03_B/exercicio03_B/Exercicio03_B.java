package lista03_B.exercicio03_B;

import java.util.Scanner;

/*
        Exercicio 03 - Escreva um programa que leia 10 números e escreva o menor valor lido é o maior
        valor lido.
    **/
public class Exercicio03_B {
    public static void main(String[] args) {
        System.out.printf("************** MAIOR E MENOR NÚMERO DE DEZ ************\n\n");
        int qtdeNumeros = 10;
        int[] numeros = new int[10];
        Scanner imput = new Scanner(System.in);
        System.out.printf("Entre com o 1º número de 10: ");
        numeros[0] = imput.nextInt();
        int maior= numeros[0];
        int menor= numeros[0];
        for(int i =1; i< qtdeNumeros; i++ ){
            System.out.printf("Entre com o %dº número de 10 : ",i+1);
            numeros[i] = imput.nextInt();
            if(numeros[i]>maior){
                maior = numeros[i];
            }
            if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.printf("O maior número digitado foi : %d \n", maior);
        System.out.printf("O menor numero digitado foi : %d", menor);

        imput.close();
    }
}

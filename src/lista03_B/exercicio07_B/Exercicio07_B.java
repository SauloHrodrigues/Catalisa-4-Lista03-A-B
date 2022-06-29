package lista03_B.exercicio07_B;

import java.util.Scanner;

/*
        Exercicio 07. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        Um número primo é aquele que é divisível somente por ele mesmo e por 1.
    * */
public class Exercicio07_B {
        public static void main(String[] args) {
            int numero;
            int acumulador =0;
            Scanner imput = new Scanner(System.in);
            System.out.printf("\n******************* CALCULO DO NÚMERO PRIMO ****************\n\n");
            System.out.print("Digite um número para verificar se o mesmo é primo: ");
            numero = imput.nextInt();
            imput.close();
            for(int i=numero; i>0; i--){
                if(numero%i ==0){
                    acumulador += 1;
                }
            }
            if(acumulador == 2){
                System.out.printf("O número %d é Primo!", numero);
            }else{
                System.out.printf("O número %d não é Primo!", numero);
            }
        }
}

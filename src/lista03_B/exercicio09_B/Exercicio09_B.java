package lista03_B.exercicio09_B;

import java.util.Scanner;

public class Exercicio09_B {
    public static void main(String[] args) {
        int numero=0;
        Scanner imput =new Scanner(System.in);
        System.out.printf("\n************* CALCULO DO FATORIAL *************\n\n");
        System.out.print("Digite o número para o cáculo do fatorial: ");
        numero = imput.nextInt();
        int fatorial =1;
        imput.close();

        for( int i = numero ; i>0; i--){
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é : %d", numero, fatorial);
    }
}

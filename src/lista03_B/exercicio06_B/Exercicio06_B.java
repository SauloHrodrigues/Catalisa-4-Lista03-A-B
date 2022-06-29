package lista03_B.exercicio06_B;

import java.util.Scanner;

/*
        Exercicio 06. Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
        O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar
        todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido (começando
        por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo de valores
        inválido” e o programa termina.
    **/
public class Exercicio06_B {
        public static void main(String[] args) {
            int numeroInicial=0;
            int numeroFinal=0;
            int soma=0;
            Scanner imput = new Scanner(System.in);
            System.out.printf("\n************* NUMEROS IMPARES EM UM INTERVALO ************ \n\n");
            System.out.print("Digite o número inicial do intervalo : ");
            numeroInicial = imput.nextInt();
            System.out.print("Digite o número final do intervalo : ");
            numeroFinal = imput.nextInt();
            imput.close();
            if(numeroInicial>=numeroFinal){
                System.out.println("Intervalo de valores Inválido!");

            } else{
                for(int i = numeroInicial; i <= numeroFinal; i++){
                    if(i%2 !=0){
                        soma+=i;
                    }
                }
                System.out.printf("A soma dos numeros impares entre %d e %d => %d", numeroInicial, numeroFinal,soma);

            }
        }
}

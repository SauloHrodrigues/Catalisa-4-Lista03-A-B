package lista03_A.exercicio02;
/*
 *       Exercicio 02 - Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar,
 *       sabendo que a decisão é sempre pelo mais barato.
 **/
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        System.out.printf("\n--------------- PRODUTO DE MENOR PREÇO ---------------\n");
        String[] produtos = new String[3];
        float[] preco = new float[3];
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do 1° produto: ");
        produtos[0] = input.next();
        System.out.print("Digite o valor do produto: ");
        preco[0] = input.nextFloat();
        for (int i = 1; i < 3; i++) {
            System.out.printf("Digite o nome do ¨%d° produto: ", i + 1);
            produtos[i] = input.next();
            System.out.print("Digite o valor do produto: ");
            preco[i] = input.nextFloat();
            if (preco[i] < preco[i - 1]) {
                index = i;
            }
        }
        System.out.print("O produto " + produtos[index] + " preço " + preco[index] + " é o mais barato!!");
    }
}

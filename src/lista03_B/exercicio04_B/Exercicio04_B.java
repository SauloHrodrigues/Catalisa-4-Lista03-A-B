package lista03_B.exercicio04_B;

import java.util.Scanner;

/*
        Exercicio 04. Faça um programa que leia n números inteiros positivos e calcule a soma desses
        números.
    */
public class Exercicio04_B {
    public static void main(String[] args) {
        int soma=0;
        boolean controle = true;
        String op = "2";
        Scanner imput = new Scanner(System.in);
        System.out.printf("\n************** EXECUTANDO A SOMA DE N NÚMEROS *************\n\n");
        while (controle){
            System.out.print("Digite um numero: ");
            soma += imput.nextInt();
            boolean aux = true;
            while (aux){
                System.out.print("Deseja digitar novo número para soma? (s/n) ");
                op = imput.next();
                if(op.equalsIgnoreCase("s")){
                    controle = true;
                    aux = false;
                }else if (op.equalsIgnoreCase("n")){
                    controle=false;
                    aux = false;
                }else{
                    aux=true;
                }
            }
        }
        imput.close();
        System.out.printf("A soma dos números digitado é : %d",soma);
    }
}

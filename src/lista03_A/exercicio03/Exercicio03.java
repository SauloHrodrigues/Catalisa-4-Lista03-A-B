package lista03_A.exercicio03;

import java.util.Scanner;

/*
*3 - Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a
* média alcançada por aluno e apresentar:
* A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
* A mensagem "Reprovado", se a média for menor do que sete;
* A mensagem "Aprovado com Distinção", se a média for igual a dez.
* */
public class Exercicio03 {
    public static void main(String[] args) {
        System.out.printf("\n\n********** CALCULO DA MÉDIA ************\n\n");
        int qtdNotas = 2;
        //float media1=0;
        float media=0;
        Scanner imput = new Scanner(System.in);
        for(int i=0;i<qtdNotas;i++){
            System.out.printf("Digite a %dª nota do aluno: ",i+1);
            media += imput.nextFloat();
        }
        imput.close();
        media = media/qtdNotas;
        System.out.println("A média do aluno é:  "+media);
    }
}

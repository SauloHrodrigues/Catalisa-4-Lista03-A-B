package lista03_A.exercicio04;

import java.util.Scanner;

/*
    Exercicxio 04 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe
    contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe
    o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        Salários até R$ 280,00 (incluindo), receberão aumento de 20%
        Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
        Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
        Salários de R$ 1500,00 em diante, receberão aumento de 5%
        Após o aumento ser realizado, informe na tela:
        O salário antes do reajuste;
        O percentual de aumento aplicado;
        O valor do aumento;
        O novo salário, após o aumento;
 */
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.printf("\n\n************** REAJUSTE SLARIAO PARA ZUPPERS ****************\n\n");
        double salario,percentualAplicado;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário do colaborador: R$ ");
        salario = input.nextDouble();
        input.close();
        if(salario<=280.00){
            percentualAplicado = 0.20;
        } else if(salario > 280.00 && salario <=700.00){
            percentualAplicado = 0.15;
        }else if(salario > 700.00 && salario < 15000.00 ){
            percentualAplicado= 0.10;
        }else{
            percentualAplicado = 0.05;
        }
        System.out.printf("O salário original do colaborador é: R$ %.2f \n", salario);
        System.out.printf("O aumento devido é de %.0f porcento \n",percentualAplicado*100);
        System.out.printf("O valor calculado de aumento é: R$ %.2f \n",salario*percentualAplicado);
        System.out.printf("O valor calculado de aumento é: R$ %.2f \n",(salario*percentualAplicado)+salario);
    }
}

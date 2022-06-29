package lista03_B.exercicio05_B;
    /*
        Exercicio 05. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
        em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).
    **/
public class Exercico05_B {
    public static void main(String[] args) {
        System.out.printf("\nCONTANDO DE 1000 EM 1000 ATÉ 100000 ************\n\n");
        int numeroInicial;
        int incremento = 1000;
        int numeroMaximo = 100000;
        for(numeroInicial=0;numeroInicial<=numeroMaximo; numeroInicial+=incremento){
            System.out.printf("%d - ",numeroInicial);
            if(numeroInicial == 19000 || numeroInicial == 37000 || numeroInicial == 55000 ||
            numeroInicial == 73000 || numeroInicial == 91000){
                System.out.println();
            }
        }
    }
}

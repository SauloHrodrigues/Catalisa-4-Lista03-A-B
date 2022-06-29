package lista03_B.exercicio01_B;

    /*
    * Exercicio 01 lista B - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
    * A primeira vez com "for" e a segunda com "while".
    * */
public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("************ CONTAGEM DE ZERO A 100 COM FOR **************\n");
        for(int i =0;i<=100; i++){
            System.out.printf("%d - ",i);
            if(i == 26 || i==51|| i==76) {
                System.out.println();
            }
        }
        System.out.println("\n\n************ CONTAGEM DE ZERO A 100 COM WHILE **************\n");
        int cont =0;
        while (cont<=100){
            System.out.printf("%d - ",cont);
            if(cont == 26 || cont==51|| cont==76) {
                System.out.println();
            }
            cont++;
        }
    }
}

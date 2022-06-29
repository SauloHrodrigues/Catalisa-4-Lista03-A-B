package lista03_B.exercicio08_B;

public class Exercicio08_B {
    public static void main(String[] args) {
        int numero = 0;
        int soma=0;
        int acumulador = 1;
        System.out.printf("\n*************** SOMA DOS 50 PRIMEIROS NÚMEROS IMPARES\n");
        for(int i = 0; acumulador <=50; i++){
            if(i%2 != 0){
                acumulador++;
                soma = soma +i;
            }
        }
        System.out.print("A Soma dos 50 primeiros numeros impares é: "+soma);
    }
}

package dio.bootcamp.basico.desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minutos;
        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = minutos* 2  ;
        System.out.printf("%d minutos\n",K); // Digite aqui o calculo dos minutos
    }
}

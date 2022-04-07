package dio.bootcamp.desafio3;

import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        double N = leitor.nextDouble();
        double X, Y;
        double resultado;
        for (double i = 0; i < N; i++) {
            X = leitor.nextDouble();
            Y = leitor.nextDouble();
            resultado = (X/Y);
            if (Y ==  0) System.out.println("divisao impossivel");

            else System.out.println(resultado);
        }
    }

}

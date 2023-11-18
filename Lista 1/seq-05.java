// (5) Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
//       Dica: use import java.lang.Math; com a função pow

// * Exemplo de execução – Exercício 5 - Caso de teste
// Insira o primeiro número:
// 2
// Insira o segundo número:
// 3
// Resultado: 8

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int first = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int second = scanner.nextInt();

        int result = (int) Math.pow(first, second);
        System.out.println("Resultado: " + result);
    }
}
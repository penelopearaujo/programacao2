// (2) Desenvolva um algoritmo que receba dois números inteiros positivos A e B. Exiba na tela todos os números inteiros compreendidos entre A e B, excluindo os próprios A e B. Suponha que o usuário respeite o enunciado e insira valores válidos para A e B.

// * Exemplo de execução – Exercício 2 - Caso de teste
// Insira o valor de A:
// 1
// Insira o valor de B:
// 10
// Série numérica:
// 2 3 4 5 6 7 8 9

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();        
        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();

        System.out.println("Série numérica:");

        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}

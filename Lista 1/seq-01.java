// (1) Faça um programa que receba quatro
// números inteiros, calcule e mostre a soma desses números.

// * Exemplo de execução – Exercício 1 - Caso de teste
// Informe quatro números, em sequência:
// 1
// 2
// 3
// 4
// Resultado da soma:  10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        total = numero1 + numero2 + numero3 + numero4;
        System.out.println(total);
    }
}
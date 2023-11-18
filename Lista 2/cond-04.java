// (4) Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais. 
// Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo. Caso contrário, mostre a soma entre os dois.

// * Exemplo de execução – Exercício 4 - Caso de teste 1
// Insira o primeiro valor:
// 2
// Insira o segundo valor:
// 2
// Multiplicação:  4

// * Exemplo de execução – Exercício 4 - Caso de teste 2
// Insira o primeiro valor:
// 2
// Insira o segundo valor:
// 1
// Subtração:  1

// * Exemplo de execução – Exercício 4 - Caso de teste 3
// Insira o primeiro valor:
// 1
// Insira o segundo valor:
// 2
// Soma:  3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        int result;

        System.out.println("Insira o primeiro valor:");
        int first = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int second = scanner.nextInt();

        if (first == second) {
            result = first*second;
            word = "Multiplicação: ";
        } else if (first > second) {
            result = first-second;
            word = "Subtração: ";
        } else {
            result = first+second;
            word = "Soma: ";
        }
        System.out.println(word + result);
    }
}
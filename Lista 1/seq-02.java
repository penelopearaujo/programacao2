// (2) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

// * Exemplo de execução – Exercício 2 - Caso de teste
// Informe três notas, em sequência:
// 5,5
// 6,0
// 6,5
// Média aritmética:  6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double media = 0;

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        System.out.println(media);
    }
}
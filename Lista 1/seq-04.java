// (4) Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.

// * Exemplo de execução – Exercício 4 - Caso de teste
// Insira a base:
// 4
// Insira a altura:
// 10
// Area do triangulo:  20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a base:");
        int base = scanner.nextInt();

        System.out.println("Insira a altura:");
        int altura = scanner.nextInt();

        int area = base*altura/2;

        System.out.println("Area do triangulo: " + area);
    }
}
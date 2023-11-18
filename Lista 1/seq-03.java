// (3) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

// * Exemplo de execução – Exercício 3 - Caso de teste
// Insira o salário:
// 1000
// Novo salário:  1250

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        double novoSalario = salario+(0.25*salario);
        System.out.println(novoSalario);
    }
}
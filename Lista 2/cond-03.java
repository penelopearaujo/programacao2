// (3) Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.

// *Exemplo de execução – Exercício 3 - Caso de teste 1
// Insira um número:
// 2
// 2 é par.

// *Exemplo de execução – Exercício 3 - Caso de teste 2
// Insira um número:
// 3
// 3 é impar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = scanner.nextInt();

        String resposta;
        resposta = (numero % 2 == 0) ? " é par" : " é ímpar";
        System.out.println(numero + resposta);
    }
}
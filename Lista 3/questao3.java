// (3) Desenvolva um algoritmo que peça para o usuário inserir vários números inteiros. O algoritmo deverá contabilizar a quantidade de números positivos informados. Caso o usuário digite 0, o algoritmo deve mostrar quantidade contabilizada e encerrar.

// * Exemplo de execução – Exercício 3 - Caso de teste
// Insira um número:
// 5
// Insira um número:
// 5
// Insira um número:
// -1
// Insira um número:
// 0
// Quantidade de positivos: 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int numero;

        do {
            System.out.println("Insira um número:");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            }

        } while (numero != 0);

        System.out.println("Quantidade de positivos: " + positivos);
    }
}

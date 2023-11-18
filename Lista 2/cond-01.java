// (1) Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".

// * Exemplo de execução – Exercício 1 - Caso de teste 1
// Insira o primeiro número:
// 1
// Insira o segundo número:
// 2
// O maior é: 2

// * Exemplo de execução – Exercício 1 - Caso de teste 2
// Insira o primeiro número:
// 1
// Insira o segundo número:
// 1
// Os números são iguais

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int first = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int second = scanner.nextInt();

        if (first == second) {
            System.out.println("Os números são iguais.");
        } else {
            int max = Math.max(first, second);
            System.out.println("O mair é: " + max);
        }
    }
}
// (5) Desenvolva um algoritmo que simule uma calculadora. 
// Você deve dar a opção de o usuário escolher entre: 
// 1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. 
// O usuário só conseguirá processar dois números inteiros por vez.

// * Exemplo de execução – Exercício 5 - Caso de teste 1
// Digite 1 para somar;
// Digite 2 para subtrair;
// Digite 3 para multiplicar;
// Digite 4 para dividir;
// 1
// Insira o primeiro valor:
// 1
// Insira o segundo valor:
// 2
// Soma: 3

// * Exemplo de execução – Exercício 5 - Caso de teste 2
// Digite 1 para somar;
// Digite 2 para subtrair;
// Digite 3 para multiplicar;
// Digite 4 para dividir;
// 2
// Insira o primeiro valor:
// 2
// Insira o segundo valor:
// 1
// Subtração: 1

// * Exemplo de execução – Exercício 5 - Caso de teste 3
// Digite 1 para somar;
// Digite 2 para subtrair;
// Digite 3 para multiplicar;
// Digite 4 para dividir;
// 3
// Insira o primeiro valor:
// 2
// Insira o segundo valor:
// 2
// Multiplicação: 4

// * Exemplo de execução – Exercício 5 - Caso de teste 4
// Digite 1 para somar;
// Digite 2 para subtrair;
// Digite 3 para multiplicar;
// Digite 4 para dividir;
// 4
// Insira o primeiro valor:
// 4
// Insira o segundo valor:
// 2
// Divisão: 2

// * Exemplo de execução – Exercício 5 - Caso de teste 5
// Digite 1 para somar;
// Digite 2 para subtrair;
// Digite 3 para multiplicar;
// Digite 4 para dividir;
// 4
// Insira o primeiro valor:
// 1
// Insira o segundo valor:
// 0
// Divisão por zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado;

        System.out.println("Digite 1 para somar;\n" + "Digite 2 para subtrair;\n" + "Digite 3 para multiplicar;\n" + "Digite 4 para dividir;");
        int operacao = scanner.nextInt();
        System.out.println("Insira o primeiro valor:");
        int numero1 = scanner.nextInt();
        System.out.println("Insira o segundo valor:");
        int numero2 = scanner.nextInt();

        switch (operacao) {
            case 1:
                resultado = numero1+numero2;
                System.out.println("Soma: "+resultado);
                break;
            case 2:
                resultado = numero1-numero2;
                System.out.println("Subtração: "+resultado);
                break;
            case 3:
                resultado = numero1*numero2;
                System.out.println("Multiplicação: "+resultado);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Divisão por zero.");
                    break;
                }
                resultado = numero1/numero2;
                System.out.println("Divisão: "+resultado);
                break;
            default:
                break;
        }
    }
}
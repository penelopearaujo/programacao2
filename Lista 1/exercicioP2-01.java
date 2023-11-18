// Exercício BJL [Seq]

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

// (5) Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
//       Dica: use import java.lang.Math; com a função pow

// * Exemplo de execução – Exercício 5 - Caso de teste
// Insira o primeiro número:
// 2
// Insira o segundo número:
// 3
// Resultado: 8

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int first = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int second = scanner.nextInt();

        int result = (int) Math.pow(first, second);
        System.out.println("Resultado: " + result);
    }
}
// (1) Desenvolva um algoritmo que some todos os números inteiros compreendidos entre 1 e 10 (inclusive).

// *Exemplo de execução – Exercício 1 - Caso de teste
// Somatório:  55

public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            soma += i;
        }

        System.out.println("Somatório: " + soma);
    }
}
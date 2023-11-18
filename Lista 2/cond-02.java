// (2) Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".

// *Exemplo de execução – Exercício 2 - Caso de teste 1
// Insira o primeiro número:
// 3
// Insira o segundo número:
// 2
// Insira o terceiro número:
// 1
// Condição satisfeita
// *Exemplo de execução – Exercício 2 - Caso de teste 2
// Insira o primeiro número:
// 2
// Insira o segundo número:
// 3
// Insira o terceiro número:
// 1
// Erro

// *Exemplo de execução – Exercício 2 - Caso de teste 3
// Insira o primeiro número:
// 2
// Insira o segundo número:
// 2
// Insira o terceiro número:
// 1
// Erro

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int first = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int second = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        int third = scanner.nextInt();

        if (first == second || first == third) {
            System.out.println("Erro");
            return;
        }

        if (first > second && first > third) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
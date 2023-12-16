// (5) Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não. A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

// *Exemplo de execução – Exercício 5 - Caso de teste 1
// Insira um número:
// 7
// 7 é primo.

// *Exemplo de execução – Exercício 5 - Caso de teste 2
// Insira um número:
// 10
// 10 não é primo.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n = scanner.nextInt();
        boolean primo = isPrimo(n);

        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

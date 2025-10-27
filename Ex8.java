import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        double n1, n2, resultado;

        do {
            System.out.println("Calculadora em Java");
            System.out.println("Escolha uma operação: \n1 - Soma \n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Encerra");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o primeiro numero da soma.");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo numero da soma.");
                    n2 = scanner.nextInt();
                    resultado = n1 + n2;
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero da subtração.");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo numero da subtração.");
                    n2 = scanner.nextInt();
                    resultado = n1 - n2;
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;
                case 3:
                    System.out.println("Digite o primeiro numero da multiplicação.");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo numero da multiplicação.");
                    n2 = scanner.nextInt();
                    resultado = n1 * n2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    break;
                case 4:
                    System.out.println("Digite o primeiro numero da divisão.");
                    n1 = scanner.nextInt();
                    System.out.println("Digite o segundo numero da divisão.");
                    n2 = scanner.nextInt();
                    if (n2 == 0){
                        System.out.println("Erro: não é possivel dividir por 0");
                    } else {
                        resultado = n1 / n2;
                        System.out.println("O resultado da divisão é: " + resultado);
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                System.out.println("Erro: Operação invalida");
                    break;
            }
        } while(op > 0);
        scanner.close();
    }
}

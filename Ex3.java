// Ler três lados (double). Sem ordenar explicitamente os lados, verificar com um único if se 
// formam um triângulo retângulo (Teorema de Pitágoras em qualquer permutação). Se for, exibir
// “Triângulo retângulo”; caso contrário, não exiba nada.

import java.util.Scanner;

public class Ex3 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo lado:");
        double b = scanner.nextDouble();
        System.out.println("Digite o terceiro lado:");
        double c = scanner.nextDouble();
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        if (Math.abs((a2 + b2) - c2) == c2|| 
            Math.abs((a2 + c2) - b2) == b2 || 
            Math.abs((b2 + c2) - a2) == a2) {
            System.out.println("Triângulo retângulo");
        }
        scanner.close();
    }
}

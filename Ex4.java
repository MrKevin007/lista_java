import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite o valor do lado a:");
        a = scanner.nextDouble();
        System.out.println("Digite o valor do lado b:");
        b = scanner.nextDouble();
        System.out.println("Digite o valor do lado c:");
        c = scanner.nextDouble();
        
        if(a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("É um triangulo equilátero.");
            } else if (a == b || b == c) {
                System.out.println("É um triangulo isoceles.");
            } else {
                System.out.println("É um triangulo escaleno.");
            }
        } else {
            System.out.println("Não é um triangulo.");
        }
        scanner.close();
    }
}

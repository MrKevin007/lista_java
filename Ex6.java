import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double entrada, soma = 0;
        int cont = 0;
        System.out.println("Digite um numero, 0 encerra");
        entrada = scanner.nextDouble();
        while(entrada > 0) {
            soma = soma + entrada;
            cont ++;
            System.out.println("Digite um numero, 0 encerra");
            entrada = scanner.nextDouble();
        }
        System.out.println("Foram digitados " + cont + " numeros");
        System.out.println("A soma de todos os valores é: " + soma);
        System.out.printf("A média é: %.2f \n " , soma / cont);
        scanner.close();
    }
}

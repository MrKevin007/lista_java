import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int segs = scanner.nextInt();
        scanner.close();
        int hora = segs / 3600;
        int minuto = segs % 3600 / 60;
        segs = segs % 60;
        System.out.printf("A hora é %02d:%02d:%02d \n", hora, minuto, segs);
    }
}

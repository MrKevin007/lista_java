import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desempenhoRuim = 0, desempenhoMedio = 0, desempenhoBom = 0, aluno = 10;
        double nota, notaSoma = 0, mediaGeral;

        for(int i = 0;i <= aluno; i++){
            System.out.println("Digite a nota do aluno");
            nota = scanner.nextDouble();
            if(nota < 5){
                desempenhoRuim ++;
            } else if (nota >= 5 && nota <= 6.9){
                desempenhoMedio ++;
            } else {
                desempenhoBom ++;
            }
            notaSoma += nota;   
        }
        mediaGeral = notaSoma / aluno;
        System.out.println("Resultado Final");
        System.out.println("Alunos com notas abaixo de 5.0: " + desempenhoRuim);
        System.out.println("Alunos com notas entre 5.0 e 6.9: " + desempenhoMedio);
        System.out.println("Alunos com notas acima de 7: " + desempenhoBom);
        System.out.printf("Média total da sala: %.2f \n", mediaGeral);
        scanner.close();
    }
}

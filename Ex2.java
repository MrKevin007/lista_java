//Ler o nome de um aparelho elétrico, sua potência nominal (em watts), número médio de horas 
//de uso diário, o valor do kWh (em reais) e o número de dias considerados no cálculo. O programa 
//deve calcular e exibir o consumo total em kWh no período, o custo total do consumo e o 
//consumo médio diário.

import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Insira o nome de um eletrodomestico.");
      String eletronico = scanner.nextLine();
      System.out.println("Insira sua potencia em watts.");
      double potencia = scanner.nextDouble();
      System.out.println("Digite a média de horas de uso diario.");
      double mediaHora = scanner.nextDouble();
      System.out.println("Quantos dias quer calcular?");
      int dias = scanner.nextInt();
      System.out.println("Qual valor do kWh em reais?");
      double valor = scanner.nextDouble();
      scanner.close();

      double consumoTotal = potencia * mediaHora * dias / 1000;
      double custoTotal = consumoTotal * valor;
      double consumoMedioDiario = consumoTotal / dias;

      System.out.println("Dado de " + eletronico + ": ");
      System.out.println("Consumo total: " + consumoTotal);
      System.out.printf("Custo total: %.2f \n", custoTotal);
      System.out.printf("Consumo medio diario: %.2f \n", consumoMedioDiario);
      }
   }

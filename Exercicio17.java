import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
    System.out.print("Digite a primeira nota: ");
    double nota1Ponderada = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2Ponderada = scanner.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3Ponderada = scanner.nextDouble();
    System.out.print("Digite o peso da primeira nota: ");
    double peso1 = scanner.nextDouble();
    System.out.print("Digite o peso da segunda nota: ");
    double peso2 = scanner.nextDouble();
    System.out.print("Digite o peso da terceira nota: ");
    double peso3 = scanner.nextDouble();
    double mediaPonderada = (nota1Ponderada * peso1 + nota2Ponderada * peso2 + nota3Ponderada * peso3) /
            (peso1 + peso2 + peso3);
    System.out.println("Média Ponderada: " + mediaPonderada);
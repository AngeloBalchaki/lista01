import java.util.Scanner;

public class Exercicio18 {

    public static void executar() { 
    System.out.print("Digite a primeira nota: ");
    double nota1Harm = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2Harm = scanner.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3Harm = scanner.nextDouble();
    double mediaHarmonica = 3 / ((1 / nota1Harm) + (1 / nota2Harm) + (1 / nota3Harm));
    System.out.println("Média Harmônica: " + mediaHarmonica);
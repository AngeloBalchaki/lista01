import java.util.Scanner;

public class Exercicio14 {

    public static void executar() { 
    System.out.print("Digite o primeiro termo (a1): ");
    int a1 = scanner.nextInt();
    System.out.print("Digite a razão (r): ");
    int r = scanner.nextInt();
    System.out.print("Digite o valor de n (n-ésimo termo): ");
    int n = scanner.nextInt();
    int an = a1 + (n - 1) * r;
    System.out.println("O " + n + "-ésimo termo é: " + an);
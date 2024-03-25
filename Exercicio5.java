import java.util.Scanner;

public class Exercicio5 {

    public static void executar() {
    System.out.print("Digite o valor de A: ");
    int A = scanner.nextInt();
    System.out.print("Digite o valor de B: ");
    int B = scanner.nextInt();
    System.out.println("Valores originais - A: " + A + ", B: " + B);
    int temp = A;
    A = B;
    B = temp;
    System.out.println("Valores trocados - A: " + A + ", B: " + B);
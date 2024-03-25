import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        
        System.out.print("Digite o valor de A: ");
        int A2 = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B2 = scanner.nextInt();
        if (A2 == B2) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("Os valores são diferentes.");
            System.out.println("O maior número é: " + Math.max(A2, B2));
        }
import java.util.Scanner;

public class Exercicio3 {

    public static void executar() {
  
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        if (A == B) {
            System.out.println("A sequência de números informada é inválida, pois são iguais.");
        } else if (A > B) {
            System.out.println("O número A é maior que o número B.");
        } else {
            System.out.println("O número B é maior que o número A.");
        }
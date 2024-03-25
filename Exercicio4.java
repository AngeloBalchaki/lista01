import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {
        
        System.out.print("Digite o primeiro número: ");
        double num3 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num4 = scanner.nextDouble();
        double soma2 = num3 + num4;
        double subtracao = num3 - num4;
        double multiplicacao = num3 * num4;
        double divisao = num3 / num4;
        System.out.println("Soma: " + soma2);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
    System.out.print("Digite três valores inteiros distintos: ");
    int val1 = scanner.nextInt();
    int val2 = scanner.nextInt();
    int val3 = scanner.nextInt();
    int tempVal;
    if (val1 > val2) {
        tempVal = val1;
        val1 = val2;
        val2 = tempVal;
    }
    if (val2 > val3) {
        tempVal = val2;
        val2 = val3;
        val3 = tempVal;
    }
    if (val1 > val2) {
        tempVal = val1;
        val1 = val2;
        val2 = tempVal;
    }
    System.out.println("Valores em ordem crescente: " + val1 + ", " + val2 + ", " + val3);

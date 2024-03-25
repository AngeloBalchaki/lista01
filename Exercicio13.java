import java.util.Scanner;

public class Exercicio13 {

    public static void executar() { 
    System.out.print("Digite o valor de A: ");
    double A3 = scanner.nextDouble();
    System.out.print("Digite o valor de B: ");
    double B3 = scanner.nextDouble();
    System.out.print("Digite o operador (+, -, *, /): ");
    char operator = scanner.next().charAt(0);
    double result;
    switch (operator) {
        case '+':
            result = A3 + B3;
            System.out.println("Resultado da adição: " + result);
            break;
        case '-':
            result = A3 - B3;
            System.out.println("Resultado da subtração: " + result);
            break;
        case '*':
            result = A3 * B3;
            System.out.println("Resultado da multiplicação: " + result);
            break;
        case '/':
            if (B3 != 0) {
                result = A3 / B3;
                System.out.println("Resultado da divisão: " + result);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
            break;
        default:
            System.out.println("Operador não definido!");
    }

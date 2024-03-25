import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {

        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();
        double consumo = tempoViagem * velocidadeMedia / 12;
        System.out.println("Quantidade de litros de combustível gasta: " + consumo);
    }
}
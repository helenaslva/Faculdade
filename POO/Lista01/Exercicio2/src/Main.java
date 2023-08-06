import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite sua altura: ");
        p1.altura = input.nextDouble();

        System.out.println("Digite sua peso: ");
        p1.peso = input.nextDouble();

        p1.calcularImc();


    }
}
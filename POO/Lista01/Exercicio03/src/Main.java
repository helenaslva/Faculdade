import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.calcularImc(input);
        System.out.println();
        p2.calcularImc(input);
        System.out.println();
        p3.calcularImc(input);
    }
}
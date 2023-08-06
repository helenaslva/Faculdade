import java.util.Scanner;

public class Pessoa {
    public double altura;
    public double peso;

    public void calcularImc(Scanner input){
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        System.out.println("Digite seu peso");
        peso = input.nextDouble();

        double imc = (peso/(altura*altura));
        System.out.println("Seu imc é: " + imc);
    }
}

package Exercicio01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa[] p = new Pessoa[3];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Pessoa();
            System.out.println("Qual o seu nome? ");
            p[i].setNome(input.nextLine());

            System.out.println("Qual o seu peso? ");
            p[i].setPeso(input.nextDouble());

            System.out.println("Qual a sua altura? ");
            p[i].setAltura(input.nextDouble());
            p[i].calculaImc();
            input.nextLine();

        }
        for (int i = 2; i >= 0; i--) {
            System.out.println("Nome: " + p[i].getNome());
            System.out.println("Altura: " + p[i].getAltura());
            System.out.println("Peso: " + p[i].getPeso());
            System.out.println("IMC: " + p[i].getImc());
            System.out.println();
            

        }
    }

}

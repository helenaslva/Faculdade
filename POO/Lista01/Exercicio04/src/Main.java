import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Pessoa[] p = new Pessoa[3];

        for(int i = 0; i < p.length; i++){
            p[i] = new Pessoa();
            System.out.println("Qual o seu nome? ");
            p[i].nome = input.nextLine();


            System.out.println("Qual o seu peso? ");
            p[i].peso = input.nextDouble();

            System.out.println("Qual a sua altura? ");
            p[i].altura = input.nextDouble();
            p[i].calculaImc();
            input.nextLine();

        }
        for (int i = 2; i >= 0; i--){
//            System.out.println("Nome: " + p[i].nome);
//            System.out.println("Altura: " + p[i].altura);
//            System.out.println("Peso: " + p[i].peso);
//            System.out.println("IMC: " + p[i].imc);
//            System.out.println();
            System.out.println(p[i].toString());

        }




    }
}
public class Pessoa {
    public double altura;
    public double peso;

    public void calcularImc(){
        double imc = (peso/(altura*altura));
        System.out.println("Seu imc é: " + imc);
    }
}

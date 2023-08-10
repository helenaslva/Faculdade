

public class Pessoa {
    public String nome;
    public double altura;
    public double peso;

    double imc;


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", imc=" + imc +
                '}';
    }

    public void calculaImc() {

        imc = (peso/(altura*altura));
        System.out.println("Seu imc é: " + imc);
    }

}

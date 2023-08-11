package Exercicio01;

public class Pessoa {

    public String nome;
    public double peso;
    public double altura;
    double imc;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void calculaImc() {

        this.imc = (this.peso / (this.altura * this.altura));
        System.out.println("Seu imc é: " + this.imc);
    }

}

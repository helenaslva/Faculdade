package Questao01Lista02;

import Questao02Lista02.Carro;
import Questao02Lista02.ListaEstaticaCarro;

public class Main {
    public static void main(String[] args) {
        ListaEstaticaCarro carro = new ListaEstaticaCarro();

        ListaEstatica<Carro> listaCarro = new ListaEstatica<>();
        listaCarro.inserir(new Carro("AAAA-1111", "Helena"));
        listaCarro.inserir(new Carro("AAAA-22222", "Helena"));
        listaCarro.inserir(new Carro("AAAA-3333", "Helena"));

        listaCarro.inverter();

        System.out.println(listaCarro);

    }
}

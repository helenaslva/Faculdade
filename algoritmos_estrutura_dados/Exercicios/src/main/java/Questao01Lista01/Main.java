package Questao01Lista01;

public class Main {
    public static void main(String[] args) {
        ListaEstaticaInt lista = new ListaEstaticaInt();

        lista.inserir(7);
        lista.inserir(2);
        lista.inserir(6);
        lista.inserir(4);
        // lista.inserir(3);

        System.out.println(lista.toString());
    }
}
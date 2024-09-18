package Questao01Lista03;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaInteiros = new ListaEncadeada<>();

        listaInteiros.inserir(3);
        listaInteiros.inserir(5);

        listaInteiros.buscar(3);
        System.out.println(listaInteiros.buscar(3).getInfo());
        System.out.println(listaInteiros.getPrimeiro());
    }
}

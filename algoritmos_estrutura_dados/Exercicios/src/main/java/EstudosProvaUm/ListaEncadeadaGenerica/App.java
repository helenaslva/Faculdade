package EstudosProvaUm.ListaEncadeadaGenerica;

public class App {
    public static void main(String[] args) {
        ListaEncadeadaGenerica<Integer> lista = new ListaEncadeadaGenerica<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);

        NoLista<Integer> no;

        no = lista.getPrimeiro();
    }
}

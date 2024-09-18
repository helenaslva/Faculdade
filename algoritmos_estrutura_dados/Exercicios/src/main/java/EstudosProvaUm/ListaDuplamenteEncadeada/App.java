package EstudosProvaUm.ListaDuplamenteEncadeada;

import EstudosProvaUm.ListaEncadeadaGenerica.NoLista;

public class App {
    public static void main(String[] args) {

        ListaDupla<String> frutas = new ListaDupla<>();
        frutas.inserir("Mamão");
        frutas.inserir("Banana");
        frutas.inserir("Manga");


        NoListaDupla<String> p = frutas.getPrimeiro();
        ListaDupla<String> listaClonada = frutas.clonar();

        System.out.println(frutas.toString());
        System.out.println("__--------------------------");
        System.out.println(listaClonada.toString());

    }
}

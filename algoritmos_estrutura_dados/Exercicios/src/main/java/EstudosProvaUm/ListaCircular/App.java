package EstudosProvaUm.ListaCircular;

public class App {
    public static void main(String[] args) {

        ListaCircular<Integer> listaCircular = new ListaCircular<>();

        System.out.println("A lista está vazia? " + listaCircular.estaVazia());

        listaCircular.inserir(15);
        listaCircular.inserir(3);
        listaCircular.inserir(7);
        listaCircular.inserir(2);
        listaCircular.inserir(10);
        listaCircular.inserir(5);


        listaCircular.exibir();

        System.out.println("A lista está vazia? " + listaCircular.estaVazia());

        NoListaCircular<Integer> buscar1 = listaCircular.buscar(10);
        boolean encontrou1 = buscar1 != null;
        System.out.println("Encontrou o valor 10? " + encontrou1);


        NoListaCircular<Integer> buscar2 = listaCircular.buscar(25);
        boolean encontrou2 = buscar2 != null;
        System.out.println("Encontrou o valor 25? " + encontrou2);

        listaCircular.retirar(15);

        NoListaCircular<Integer> obterNo = listaCircular.obterNo(7);
        System.out.println(obterNo.getInfo());

        listaCircular.exibir();

    }
}

package Filas.Exercicios;

public class App {
    public static void main(String[] args) {

        FilaVetor<Integer> fila = new FilaVetor<>(5);
        FilaVetor<Integer> filaDois = new FilaVetor<>(4);

        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        fila.inserir(5);

        fila.retirar();
        fila.encolher();

        System.out.println(fila.toString());



        filaDois.inserir(6);
        filaDois.inserir(7);
        filaDois.inserir(8);
        filaDois.inserir(9);

        //System.out.println(fila.toString());
        //System.out.println(filaDois.toString());

        FilaVetor<Integer> filaTres = fila.criarFilaConcatenada(filaDois);

        //System.out.println(filaTres.toString());

       // System.out.println(fila.peek());
        //System.out.println(fila.peek());
    }


}

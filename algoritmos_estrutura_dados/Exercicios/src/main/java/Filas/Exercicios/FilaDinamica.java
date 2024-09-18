package Filas.Exercicios;

public class FilaDinamica<T> implements Fila{

    private ListaEncadeada lista;
    private int tamanho;
    private T inicio;

    public FilaDinamica() {
        lista = new ListaEncadeada();
        this.tamanho = 0;
        this.inicio = null;

    }

    @Override
    public void inserir(Object valor) {
        lista.inserirNoFinal(valor);
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T valor =  peek();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }
}

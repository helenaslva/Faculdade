package Pilhas;

public class PilhaDinamica implements Pilha{
    private ListaEncadeada<Integer> lista;

    public PilhaDinamica() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(int valor) {
        lista.inserir(valor);
    }

    @Override
    public int pop() {
        int valor = peek();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public int peek() {
        if(estaVazia()){
            throw new RuntimeException("A pilha está vazia!");
        }

        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

    @Override
    public String toString(){
        return lista.toString();
    }

}

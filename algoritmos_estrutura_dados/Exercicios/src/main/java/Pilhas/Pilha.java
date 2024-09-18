package Pilhas;

public interface Pilha {
    void push(int valor);
    int pop();
    int peek();

    boolean estaVazia();
    void liberar();
}

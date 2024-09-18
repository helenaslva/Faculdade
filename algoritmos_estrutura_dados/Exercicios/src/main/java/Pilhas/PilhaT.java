package Pilhas;

public interface PilhaT<T> {

        void push(T v);

        T pop ();

        T peek();

        boolean estaVazia();

        void liberar();


}

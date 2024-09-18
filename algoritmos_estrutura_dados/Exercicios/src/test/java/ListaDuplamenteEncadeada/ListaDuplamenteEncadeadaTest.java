package ListaDuplamenteEncadeada;

import Questao01Lista02.ListaEstatica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDuplamenteEncadeadaTest {
    private ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();


    @Test
    void inserir() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals("20,15,10,5", lista.toString());
        //assertEquals("5,10,15,20", lista.exibirOrdemInversa());
    }

    @Test
    void buscar() {
    }

    @Test
    void retirar() {
    }

    @Test
    void exibirOrdemInversa() {
    }

    @Test
    void liberar() {
    }
}
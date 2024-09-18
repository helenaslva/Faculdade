package EstudosProvaUm.ListaDuplamenteEncadeada;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDuplaTest {
    private ListaDupla<Integer> lista = new ListaDupla<>();

    @Test
    @Order(1)
    public void testInclusao() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoListaDupla<Integer> no;
        int valor;

        no = lista.getPrimeiro();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(10, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(5, valor);

        NoListaDupla<Integer> ultimo = lista.obterUltimo();

        // percorre do último até o primeiro
        valor = ultimo.getInfo();
        assertEquals(5, valor);

        no = ultimo.getAnterior();
        valor = no.getInfo();
        assertEquals(10, valor);

        no = no.getAnterior();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getAnterior();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getAnterior();
        assertEquals(null, no);
    }

    @Test
    @Order(2)
    public void testBuscarInicio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoListaDupla<Integer> no = lista.buscar(20);
        assertEquals(20, no.getInfo());
    }

    @Test
    @Order(3)
    public void testBuscarMeio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoListaDupla<Integer> no = lista.buscar(10);
        assertEquals(10, no.getInfo());
    }

    @Test
    @Order(4)
    public void testRetirarInicio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);

        NoListaDupla<Integer> no;
        int valor;

        no = lista.getPrimeiro();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(10, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(5, valor);

        NoListaDupla<Integer> ultimo = no;

        no = no.getProximo();
        assertEquals(null, no);

        // percorre do último até o primeiro
        valor = ultimo.getInfo();
        assertEquals(5, valor);

        no = ultimo.getAnterior();
        valor = no.getInfo();
        assertEquals(10, valor);

        no = no.getAnterior();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getAnterior();
        assertEquals(null, no);
    }

    @Test
    @Order(5)
    public void testRetirarMeio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(10);

        NoListaDupla<Integer> no;
        int valor;

        no = lista.getPrimeiro();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(5, valor);

        NoListaDupla<Integer> ultimo = no;

        no = no.getProximo();
        assertEquals(null, no);

        // percorre do último até o primeiro
        valor = ultimo.getInfo();
        assertEquals(5, valor);

        no = ultimo.getAnterior();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getAnterior();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getAnterior();
        assertEquals(null, no);
    }

    @Test
    @Order(6)
    public void testRetirarFim() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(5);

        NoListaDupla<Integer> no;
        int valor;

        no = lista.getPrimeiro();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getProximo();
        valor = no.getInfo();
        assertEquals(10, valor);

        NoListaDupla<Integer> ultimo = no;

        no = no.getProximo();
        assertEquals(null, no);

        // percorre do último até o primeiro
        valor = ultimo.getInfo();
        assertEquals(10, valor);

        no = ultimo.getAnterior();
        valor = no.getInfo();
        assertEquals(15, valor);

        no = no.getAnterior();
        valor = no.getInfo();
        assertEquals(20, valor);

        no = no.getAnterior();
        assertEquals(null, no);
    }

    @Test
    @Order(7)
    public void testLiberar() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        NoListaDupla<Integer> no5  = lista.buscar(5);
        NoListaDupla<Integer> no10 = lista.buscar(10);
        NoListaDupla<Integer> no15 = lista.buscar(15);
        NoListaDupla<Integer> no20 = lista.buscar(20);

        lista.liberar();

        assertNull(no5.getAnterior());
        assertNull(no5.getProximo());

        assertNull(no10.getAnterior());
        assertNull(no10.getProximo());

        assertNull(no15.getAnterior());
        assertNull(no15.getProximo());

        assertNull(no20.getAnterior());
        assertNull(no20.getProximo());

        assertNull(lista.getPrimeiro());
    }

}
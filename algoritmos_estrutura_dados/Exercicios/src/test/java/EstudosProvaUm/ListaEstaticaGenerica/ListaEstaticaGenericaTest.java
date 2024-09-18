package EstudosProvaUm.ListaEstaticaGenerica;

import Questao01Lista02.ListaEstatica;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEstaticaGenericaTest {

    private ListaEstaticaGenerica<Carro> listaEstatica = new ListaEstaticaGenerica<>();
    @Test
    @Order(1)
    void testeInserirCarros () {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        assertEquals("ABC-1234, DFG-5678, MMM-5555, AAA-1111", listaEstatica.toString());
    }

    @Test
    @Order(2)
    void testeTamanho() {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        assertEquals(4, listaEstatica.getTamanho());
    }

    @Test
    @Order(3)
    void testeBuscarElementoExistente() {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        assertEquals(1, listaEstatica.buscar(new Carro("DFG-5678", "José")));
    }

    @Test
    @Order(4)
    void testeBuscarValorInexistente() {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        assertEquals(-1, listaEstatica.buscar(new Carro("HAG-2371", "Helena")));
    }

    @Test
    @Order(5)
    void testeRetirar() {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        listaEstatica.retirar(new Carro("AAA-1111", "Ana"));

        assertEquals(3, listaEstatica.getTamanho());
        assertEquals("ABC-1234, DFG-5678, MMM-5555", listaEstatica.toString());
    }

    @Test
    @Order(6)
    void testeInclusãoComRedirecionamento() {
        listaEstatica.inserir(new Carro("AAA-1111","Maria"));
        listaEstatica.inserir(new Carro("BBB-2222", "João"));
        listaEstatica.inserir(new Carro("CCC-3333", "Ana"));
        listaEstatica.inserir(new Carro("DDD-4444", "Pedro"));
        listaEstatica.inserir(new Carro("EEE-5555", "Sofia"));
        listaEstatica.inserir(new Carro("FFF-6666", "Luís"));
        listaEstatica.inserir(new Carro("GGG-7777", "Inês"));
        listaEstatica.inserir(new Carro("HHH-8888", "Miguel"));
        listaEstatica.inserir(new Carro("III-9999", "Carolina"));
        listaEstatica.inserir(new Carro("JJJ-0101", "Tiago"));
        listaEstatica.inserir(new Carro("KKK-0202", "Catarina"));
        listaEstatica.inserir(new Carro("LLL-0303", "André"));
        listaEstatica.inserir(new Carro("MMM-0404", "Rita"));
        listaEstatica.inserir(new Carro("NNN-0505", "Bruno"));

        assertEquals("AAA-1111, BBB-2222, CCC-3333, DDD-4444, EEE-5555, FFF-6666, GGG-7777, HHH-8888, III-9999, JJJ-0101, KKK-0202, LLL-0303, MMM-0404, NNN-0505", listaEstatica.toString());
    }

    @Test
    void obterElemento() {
        listaEstatica.inserir(new Carro("ABC-1234", "João"));
        listaEstatica.inserir(new Carro("DFG-5678", "José"));
        listaEstatica.inserir(new Carro("MMM-5555", "Maria"));
        listaEstatica.inserir(new Carro("AAA-1111", "Ana"));

        Carro carroEsperado = new Carro("DDD-4444", "Pedro");
        listaEstatica.inserir(carroEsperado);

        Carro novoCarro = new Carro("DDD-4444", "Pedro");

        Carro valorEncontrado = listaEstatica.obterElemento(4);

        assertEquals(novoCarro, valorEncontrado);
    }
    @Test
    @Order(8)
    public void testarObterElementoInexistente() {

        assertThrows(IndexOutOfBoundsException.class, () -> {
            listaEstatica.inserir(new Carro("AAA-1111","Maria"));
            listaEstatica.inserir(new Carro("BBB-2222", "João"));
            listaEstatica.inserir(new Carro("CCC-3333", "Ana"));
            listaEstatica.inserir(new Carro("DDD-4444", "Pedro"));

            listaEstatica.obterElemento(5);
        });


    }
    @Test
    @Order(9)
    public void testarLiberar() {
        listaEstatica.inserir(new Carro("AAA-1111","Maria"));
        listaEstatica.inserir(new Carro("BBB-2222", "João"));
        listaEstatica.inserir(new Carro("CCC-3333", "Ana"));
        listaEstatica.inserir(new Carro("DDD-4444", "Pedro"));

        listaEstatica.liberar();

        assertEquals(true, listaEstatica.estaVazia());
    }

    @Test
    @Order(10)
    public void testarInverterComPares() {
        listaEstatica.inserir(new Carro("AAA-1111", "João"));
        listaEstatica.inserir(new Carro("BBB-2222", "José"));
        listaEstatica.inserir(new Carro("CCC-3333", "Maria"));
        listaEstatica.inserir(new Carro("DDD-4444", "Ana"));

        listaEstatica.inverter();

        assertEquals("DDD-4444, CCC-3333, BBB-2222, AAA-1111", listaEstatica.toString());
    }

    @Test
    @Order(11)
    public void testarInverterComImpar() {
        listaEstatica.inserir(new Carro("AAA-1111", "João"));
        listaEstatica.inserir(new Carro("BBB-2222", "José"));
        listaEstatica.inserir(new Carro("CCC-3333", "Maria"));
        listaEstatica.inserir(new Carro("DDD-4444", "José"));
        listaEstatica.inserir(new Carro("EEE-5555", "Maria"));

        listaEstatica.inverter();

        assertEquals("EEE-5555, DDD-4444, CCC-3333, BBB-2222, AAA-1111", listaEstatica.toString());
    }
}
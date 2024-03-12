package Questao01Lista02;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TesteListaEstaticaGenerica{

    private ListaEstatica<Integer> listaEstatica = new ListaEstatica();


    @Test
    @Order(1)
    public void testInverter() {
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        listaEstatica.inverter();
        assertEquals("20, 15, 10, 5", listaEstatica.toString());
    }
    @Test
    @Order(2)
    public void testInverterNumeroImparDeDados() {
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        listaEstatica.inserir(25);
        listaEstatica.inverter();
        assertEquals("25, 20, 15, 10, 5", listaEstatica.toString());
    }

}

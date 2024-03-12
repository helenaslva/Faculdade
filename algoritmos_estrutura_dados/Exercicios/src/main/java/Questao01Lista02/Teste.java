package Questao01Lista02;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class TesteListaEstaticaGenerica{

        private ListaEstatica<Integer> listaEstatica = new ListaEstatica();


        @Test
        @Order(1)
        public void testInverter() {
            listaEstatica.inserir(5);
            listaEstatica.inserir(10);
            listaEstatica.inserir(15);
            listaEstatica.inserir(20);

            assertEquals("20, 15, 10, 5", listaEstatica.toString());
        }

    }
}

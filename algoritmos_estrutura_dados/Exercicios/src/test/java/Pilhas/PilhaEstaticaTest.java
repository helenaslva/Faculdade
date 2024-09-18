package Pilhas;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaEstaticaTest {
    PilhaEstatica pilhaEstatica = new PilhaEstatica(5);
    @Test
    @Order(1)
    public void testePilhaVazia(){
        assertEquals(true, pilhaEstatica.estaVazia());
    }

    @Test
    @Order(2)
    public void testePilhaNaoVazia(){
        pilhaEstatica.push(4);

        assertEquals(false, pilhaEstatica.estaVazia());
    }
}
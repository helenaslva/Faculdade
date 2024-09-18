package Filas.Exercicios;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestesFilaVetor {
    FilaVetor<Integer> fila;

    @Order(1)
    @Test
    public void testarFilaVazia() {
        fila = new FilaVetor(5);

        assertEquals(fila.estaVazia(), true);
    }
    @Order(2)
    @Test
    public void testarFilaNaoVazia(){
        fila = new FilaVetor(5);
        fila.inserir(5);

        assertEquals(fila.estaVazia(), false);
    }
    @Order(3)
    @Test
    public void testarFilaDesenfileirada(){
        fila = new FilaVetor(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(fila.retirar(), 10);
        assertEquals(fila.retirar(), 20);
        assertEquals(fila.retirar(), 30);
        assertEquals(fila.estaVazia(), true);
    }

    @Order(4)
    @Test
    public void testarFilaCheia(){
        fila = new FilaVetor(2);
        fila.inserir(10);
        fila.inserir(20);


        assertThrows(RuntimeException.class, () ->{
            fila.inserir(5);
            fila.inserir(10);
        });
    }

    @Order(5)
    @Test
    public void testarFilaVaziaExcecao(){
        fila = new FilaVetor(2);

        assertThrows(RuntimeException.class, () ->{
            fila.retirar();
        });
    }

    @Order(6)
    @Test
    public void testarRetornoPrimeiroELemento(){
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(fila.peek(), 10);
    }
    @Order(7)
    @Test
    public void testarLiberarLista(){
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.liberar();
        assertEquals(true, fila.estaVazia());
    }

    @Order(8)
    @Test
    public void testarListasConcatenadas(){
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        FilaVetor<Integer> filaDois = new FilaVetor<>(2);
        filaDois.inserir(40);
        filaDois.inserir(50);

        FilaVetor<Integer> filaTres = fila.criarFilaConcatenada(filaDois);
        assertEquals("10, 20, 30, 40, 50", filaTres.toString());
        assertEquals("10, 20, 30", fila.toString());
        assertEquals("40, 50", filaDois.toString());
    }
}

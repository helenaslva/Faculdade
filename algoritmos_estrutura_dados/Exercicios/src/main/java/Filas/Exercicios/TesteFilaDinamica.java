package Filas.Exercicios;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteFilaDinamica {

    FilaDinamica<Integer> fila;

    @Order(1)
    @Test
    public void testarFilaVazia(){
        fila = new FilaDinamica<>();

        assertEquals(true, fila.estaVazia());
    }
    @Order(2)
    @Test
    public void testarFilaNaoVazia(){
        fila = new FilaDinamica<>();

        fila.inserir(10);

        assertEquals(false, fila.estaVazia());
    }

    @Order(3)
    @Test
    public void testarFilaEnfileiradaCorretamente(){
        fila = new FilaDinamica<>();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());

        assertEquals(true, fila.estaVazia());
    }

    @Order(4)
    @Test
    public void testarRetornoInicioFila(){
        fila = new FilaDinamica<>();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());

    }

    @Order(5)
    @Test
    public void testarLiberacaoFila(){
        fila = new FilaDinamica<>();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.liberar();
        assertEquals(true, fila.estaVazia());

    }
}


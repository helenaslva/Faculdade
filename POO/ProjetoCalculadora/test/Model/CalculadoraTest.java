/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author helenas
 */
public class CalculadoraTest {

    Calculadora calc;

    @Before
    public void inicializarContexto() {
        calc = new Calculadora();
    }

    /**
     * Caso de teste 1 Validar a soma de numeros inteiros
     */
    @Test
    public void testValidarSomaNumInteiros() {

        assertEquals(85, calc.somar(10, 75));
    }

    /**
     * Caso de teste 2 
     * Validar a subtracao de numeros inteiros
     */
    @Test
    public void testValidarSubtracaoNumInteiros() {

        assertEquals(65, calc.subtrair(100, 35));
    }

    /**
     * Caso de teste 3 
     * Validar a multiplicacao de numeros inteiros
     */
    @Test
    public void testValidarMultiplicacao() {
        assertEquals(40, calc.multiplicar(5, 8));
    }
    
     /**
     * Caso de teste 4 
     * Validar a divisao de numeros inteiros
     */
    @Test
    public void testValidarDivisaoNumInteiros() {
        assertEquals(5, calc.dividir(10, 2));
    }
    
   // @Test(expected = IllegalArgumentException.class)
   // public void testValidarSubtracaoNumNegativo() {
   //     calc.subtrair(-10, 9);
   // }//tem que passar

}

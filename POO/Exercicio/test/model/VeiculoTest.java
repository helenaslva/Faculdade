/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author helenas
 */
public class VeiculoTest {
    
    public VeiculoTest() {
    }

    @Test
    public void testSomeMethod() {
        Veiculo veiculo = new Veiculo("SASD", "Audi", "carro");
        assertEquals(30.0, veiculo.calculaValorTotal(15, 18), 0.00);
    }
    
}

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
public class EstadiaTest {
    
    public EstadiaTest() {
    }

    @Test
    public void VerificaValorDiaSeguinte() {
        Estadia estadia = new Estadia(20, 2);
        assertEquals(18.0, estadia.calcularValorPagar(), 0.00);
    }
    
}

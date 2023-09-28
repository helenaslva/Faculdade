/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Lista09Questao02;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author helenas
 */
public class ContaBancariaTest {
    ContaBancaria conta; 
    
    @Before
    public void ContaBancariaTest() {
      conta = new ContaBancaria();
      conta.depositar(1000);
      conta.sacar(250);
    }

    @Test
        public void conferirMovimentos() {
        
        assertEquals(2, conta.getMovimentos().size());
    }


    
}

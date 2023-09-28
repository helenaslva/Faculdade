/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lista09;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author helenas
 */
public class ContaEspecialTest {
    ContaEspecial contaEspecial;
    
    @Before
    public void ContaEspecialTest() {
        contaEspecial = new ContaEspecial();
    }

    @Test
    public void permiteValorMaiorQueSaldo() {
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        contaEspecial.sacar(50);
        assertEquals(-30, contaEspecial.getSaldo(), 0.00);
        
    }
    @Test
    public void verficiaValorSuperiorAoSaldo(){
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        contaEspecial.sacar(120);
        assertEquals(-100, contaEspecial.getSaldo(), 0.00);
    }
    @Test(expected = IllegalArgumentException.class)
    public void verificaSacarSuperiorSaldoElimite(){
        contaEspecial.setLimiteCredito(100);
        contaEspecial.depositar(20);
        contaEspecial.sacar(120.01);
        contaEspecial.getSaldo();
        
    }
    
}

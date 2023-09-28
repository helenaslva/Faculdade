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
public class FuncionarioTest {

    @Test
    public void VerificarSalarioPrimeiraFaixa1() {
        Funcionario func = new Funcionario("Teste1", 850);
        assertEquals(FaixaIrpf.PRIMEIRA, func.identificarFaixaIrpf());
    }

    @Test
    public void VerficaImpostoPrimeiraFaixa1() {
        Funcionario func = new Funcionario("Teste2", 85);
        assertEquals(0, func.calcularIrpf(), 0);

    }

    @Test
    public void VerificarSalarioPrimeiraFaixa2() {
        Funcionario func = new Funcionario("Teste3", 1903);
        assertEquals(FaixaIrpf.PRIMEIRA, func.identificarFaixaIrpf());
    }

    @Test
    public void VerficaImpostoPrimeiraFaixa2() {
        Funcionario func = new Funcionario("Teste4", 1903);
        assertEquals(0, func.calcularIrpf(), 0);

    }

    @Test
    public void VerificarSalarioSegundaFaixa() {
        Funcionario func = new Funcionario("Teste5", 1903.99);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }

    @Test
    public void VerficaImpostoSegundaFaixa() {
        Funcionario func = new Funcionario("Teste6", 1903.99);
        assertEquals(0, func.calcularIrpf(), 0);

    }

    @Test
    public void VerificarSalarioSegundaFaixa2() {
        Funcionario func = new Funcionario("Teste7", 2000);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }

        @Test
    public void VerficaImpostoSegundaFaixa2() {
        Funcionario func = new Funcionario("Teste8", 1903.99);
        assertEquals(7.2, func.calcularIrpf(), 0);

    }
    
     @Test
    public void VerificarSalarioSegundaFaixa3() {
        Funcionario func = new Funcionario("Teste9", 2826.65);
        assertEquals(FaixaIrpf.SEGUNDA, func.identificarFaixaIrpf());
    }
}

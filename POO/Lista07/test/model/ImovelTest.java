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
public class ImovelTest {

    public ImovelTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusaAreaNegativa() {
        Imovel imovel = new Imovel();
        imovel.setArea(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusaAreaNaoDefinida() {
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        imovel.setBairro(bairro);

        imovel.calcularIptu();
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusaFinalidadeNaoDefinida() {
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(250);

        imovel.setBairro(bairro);

        imovel.calcularIptu();
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusaBairroNaoDefinido() {
        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(250);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);

        imovel.calcularIptu();
    }

    @Test
    public void calcularImpostoImoveisReisdenciais() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(400);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);

        assertEquals(400.00, imovel.calcularIptu(), 0.00);
    }

    @Test
    public void calcularImpostoImoveisComerciaisCemMetros() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(80);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);

        assertEquals(500.00, imovel.calcularIptu(), 0.00);
    }

    @Test
    public void calcularImpostoImoveisComerciaisQuatrocentosMetros() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(80);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);

        assertEquals(500.00, imovel.calcularIptu(), 0.00);
    }

    @Test
    public void calcularImpostoImoveisComerciaisQuatrocentosMetrosDois() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(250);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);

        assertEquals(1000.00, imovel.calcularIptu(), 0.00);
    }
    
     @Test
    public void calcularImpostoImoveisComerciaisAcimaQuatrocentosMetros() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(500);
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setBairro(bairro);

        assertEquals(1275.00, imovel.calcularIptu(), 0.00);
    }
        @Test
    public void calcularImpostoImoveisIndustriaisAteDoisMilMetros() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(2000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);

        assertEquals(1000, imovel.calcularIptu(), 0.00);
    }
           @Test
    public void calcularImpostoImoveisIndustriaisAcimaDoisMilMetros() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);

        Imovel imovel = new Imovel();
        imovel.setArea(3000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setBairro(bairro);

        assertEquals(1650, imovel.calcularIptu(), 0.01);
    }

              @Test
    public void calcularImpostoImoveisBairroDoisEmeio() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(2.5);

        Imovel imovel = new Imovel();
        imovel.setArea(500000);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);

        assertEquals(1250, imovel.calcularIptu(), 0.01);
    }
 
}

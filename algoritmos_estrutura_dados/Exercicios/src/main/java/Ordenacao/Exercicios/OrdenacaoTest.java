package Ordenacao.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrdenacaoTest {

    private void testar(OrdenacaoAbstract<Integer> ordenacao) {
        Integer[] dados = new Integer[] {70,2,88,15,90,30};
        ordenacao.setInfo(dados);
        ordenacao.ordenar();

        for (int i = 0; i<dados.length; i++ ) {
            System.out.println(dados[i]);
        }

        assertEquals(2,  dados[0].intValue());
        assertEquals(15, dados[1].intValue());
        assertEquals(30, dados[2].intValue());
        assertEquals(70, dados[3].intValue());
        assertEquals(88, dados[4].intValue());
        assertEquals(90, dados[5].intValue());
    }

    @Test
    public void testBolha() {
        OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoBolha<>();
        testar(ordenacao);
    }

    @Test
    public void testBolhaOtimizado() {
        OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoBolhaOtimizada<>();
        testar(ordenacao);
    }


    @Test
    public void testQuickSort() {
        OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoQuickSort<>();
        testar(ordenacao);
    }

    @Test
    public void testMergeSort() {
        OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoMergeSort<>();
        testar(ordenacao);
    }


}
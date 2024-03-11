/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author helenas
 */
public class Lista14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
     Pais pais = new Pais();
     
     Importador importador = new Importador(pais);
     
     importador.carregarArquivo(new File("C:\\Users\\helenas\\Downloads\\L14_municipios.csv"));
     
     Cidade cidadeMaiorPopulacao = pais.obterCidadeMaiorPopulacao();
     Cidade cidadeMenorPopulacao = pais.obterCidadeMenorPopulacao();
        System.out.println("****** CIDADE MAIOR POPULAÇÃO *****");
        System.out.println("Nome: "+cidadeMaiorPopulacao.getNome());
        System.out.println("População: " + cidadeMaiorPopulacao.getPopulacao());
        System.out.println("****** CIDADE MENOR POPULAÇÃO *****");
        System.out.println("Nome: "+cidadeMenorPopulacao.getNome());
        System.out.println("População: " + cidadeMenorPopulacao.getPopulacao());
        
        
    }
    
}

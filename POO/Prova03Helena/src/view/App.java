/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import model.Chapa;
import model.ImportadorUrna;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        ImportadorUrna importador = new ImportadorUrna();
        System.out.println("***** SISTEMA DE APURAÇÃO DE URNAS *****");
        System.out.println("Digite o caminho do arquivo: ");
        File arquivo = new File(input.next());
        importador.setArquivo(arquivo);
        
        System.out.println("");
        System.out.println("***** Relação de Votos por Chapa *****");
        importador.processarArquivo();
        for(Map.Entry<Chapa, Integer> entrada: importador.getVotos().entrySet()){
            System.out.println("------------------------------------------------------------------");
            System.out.println(entrada.getKey().getNome() + "- Total de votos: " + entrada.getValue());
            System.out.println(">>Presidente: " + entrada.getKey().getPresidente()+ " Curso: " + entrada.getKey().getCursoPresidente());
            System.out.println(">>Vice Presidente: " + entrada.getKey().getVicePresidente()+ " Curso: " + entrada.getKey().getCursoVicePresidente());
            System.out.println("------------------------------------------------------------------");
        }
        
        System.out.println("***** TOTALIZAÇÕES *****");
        System.out.println("Total geral de votos: " + importador.obterTotalVotos());
        System.out.println("Chapa Vencedora foi " + importador.obterChapaVencedora().getKey().getNome() + " com " + importador.obterChapaVencedora().getValue() + " votos");
                
                
                
        
    }
    
}

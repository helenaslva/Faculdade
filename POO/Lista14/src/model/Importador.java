/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author helenas
 */
public class Importador {
    private Pais pais; 
    public Importador(Pais pais) {
        this.pais = pais; 
    }
    
    public void carregarArquivo(File arquivo) throws FileNotFoundException{
        try(Scanner sc = new Scanner(arquivo, "UTF-8")){  
            if(sc.hasNext()){ //Consumir a primeira linha porque é só o cabeçalho
                sc.nextLine();
            } 
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] dados = linha.split(";");
                
                Cidade novaCidade = new Cidade();
                
                novaCidade.setCodigoIbge(Integer.parseInt(dados[0]));
                novaCidade.setNome(dados[1]);
            
               
                
                Estado novoEstado = pais.localizarEstado(dados[2]);
                if(novoEstado == null){
                    novoEstado = new Estado(dados[2]);
                    pais.incluirEstado(novoEstado);
                }
                
                novaCidade.setEstado(novoEstado);
                novaCidade.setPopulacao(Long.parseLong(dados[3]));
                
                pais.incluirCidade(novaCidade);
                
            }
        }
    }
    
    
    
}

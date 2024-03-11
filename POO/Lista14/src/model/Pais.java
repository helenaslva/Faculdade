/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class Pais {

    private ArrayList<Cidade> cidades; 
    private ArrayList<Estado> estados; 
    //
    public Pais() {
        cidades = new ArrayList();
        estados = new ArrayList();
    }
    
    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }
    
    public void incluirCidade(Cidade cidade){
        this.cidades.add(cidade);
    }
    public void incluirEstado(Estado estado){
        this.estados.add(estado);
    }
    
    public Cidade obterCidadeMaiorPopulacao(){
        Cidade cidadeMaiorPopulacao = cidades.get(0); 
        
        for(Cidade c: cidades){
            if(c.getPopulacao() > cidadeMaiorPopulacao.getPopulacao()){
                cidadeMaiorPopulacao = c; 
            }
        }
        
        return cidadeMaiorPopulacao; 
    }
    
    
    public Cidade obterCidadeMenorPopulacao(){
        
        Cidade cidadeMenorPopulacao = cidades.get(0);
        
        for(Cidade c: cidades){
            if(c.getPopulacao() < cidadeMenorPopulacao.getPopulacao()){
                cidadeMenorPopulacao = c; 
            }
        }
        return cidadeMenorPopulacao; 
    }
    
    public Estado localizarEstado(String nomeEstado){
        
        for(Estado e: estados){
            if(nomeEstado.equalsIgnoreCase(e.getNome())){
               return e;
            }
           
        }
      return null;
    }
    

    
    
    
}

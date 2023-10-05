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
public class Conta {
    ArrayList<Pagavel> pagavel = new ArrayList();

    public ArrayList<Pagavel> getPagavel() {
        return pagavel;
    }
    
    
    public void incluirConta(Pagavel conta){
        pagavel.add(conta);
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0; 
        
        for(Pagavel p: pagavel){
            valorTotal += p.calcularValorPagar();
        }
        
        return valorTotal; 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class PrevidenciaPrivada extends Investimentos {

//    public PrevidenciaPrivada(double valor) {
//        this.valor = valor;
//    }

    private double valor; 

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void investir(){
        setSaldo(getSaldo() + valor);
       
    }
  
    @Override
    public double calcularValorPagar() {
        return this.getValor();
    }
    
}

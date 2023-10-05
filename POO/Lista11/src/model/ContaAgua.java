/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class ContaAgua implements Pagavel{

    public ContaAgua(int metrosCubicos, double valorMetroCubico) {
        this.setMetrosCubicos(metrosCubicos);
        this.setValorMetroCubico(valorMetroCubico);
    }

    private int metrosCubicos;

    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
          if(metrosCubicos < 0){
            throw new IllegalArgumentException("O valor não deve ser negativo");
        }
        this.metrosCubicos = metrosCubicos;
    }

    public double getValorMetroCubico() {
        return valorMetroCubico;
    }

    public void setValorMetroCubico(double valorMetroCubico) {
        if(valorMetroCubico < 0){
            throw new IllegalArgumentException("O valor não deve ser negativo");
        }
        this.valorMetroCubico = valorMetroCubico;
    }
    private double valorMetroCubico; 
    
    
    @Override
    public double calcularValorPagar() {
        return this.getMetrosCubicos() * this.getValorMetroCubico();
    }
    
}

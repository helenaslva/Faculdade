/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class MensalidadeEnsino implements Pagavel{

    public MensalidadeEnsino(int nrCreditos, double valorCredito) {
        this.setNrCreditos(nrCreditos);
        this.setValorCredito(valorCredito);
    }
    
    private int nrCreditos;
    private double valorCredito;

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        if(nrCreditos < 0){
            throw new IllegalArgumentException("Número de creditos não pode ser negativo");
        }
        this.nrCreditos = nrCreditos;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
          if(valorCredito < 0){
            throw new IllegalArgumentException("Valor de creditos não pode ser negativo");
        }
        this.valorCredito = valorCredito;
    }

    @Override
    public double calcularValorPagar() {
        return this.getNrCreditos() * this.getValorCredito();
        
    }
}
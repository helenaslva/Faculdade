/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista09;

/**
 *
 * @author helenas
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteCredito; 

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor){
        if(valor > this.limiteCredito + this.getSaldo()){
            throw new IllegalArgumentException("Valor de saque não tolerado");
        }
        this.setSaldo(this.getSaldo() - valor); 
    }
    
}

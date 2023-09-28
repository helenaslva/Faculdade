/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista09;

/**
 *
 * @author helenas
 */
public class ContaBancaria {
    private String numero; 
    private double saldo;
    private Cliente cliente; 

    public Cliente getTitular() {
        return cliente;
    }

    public void setTitular(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }
        
    }
    public void sacar(double valor){
         if(valor > 0 && valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - valor);
        }
        
    }
    public void transferir(ContaBancaria contaDestino, double valor){
         this.sacar(valor);
         contaDestino.depositar(valor);
    }
    
    
   
    
}

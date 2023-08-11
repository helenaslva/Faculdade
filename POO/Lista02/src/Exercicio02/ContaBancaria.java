/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author helenas
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
   
    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor){
         if(valor < 0 || valor > this.getSaldo()){
            throw new IllegalArgumentException("Valor negativo para deposito");
        }
         this.saldo = this.getSaldo() - valor;
        
    }
    public void transferir(ContaBancaria contaDestino, double valor){
        contaDestino.depositar(valor);
        this.sacar(valor);
        
    }
    public void depositar(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Valor negativo para deposito");
        }
        this.saldo = this.getSaldo()+ valor;
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista09Questao02;

import Lista09Questao02.Movimento;
import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class ContaBancaria {
    private String numero; 
    private double saldo;
    private Cliente cliente; 
    private ArrayList<Movimento> movimentos;
   

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

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
            Movimento m = new Movimento(valor, TipoMovimento.CREDITO);
            this.incluirMovimento(m);
            this.setSaldo(this.getSaldo() + valor);
        }
        
    }
    public void sacar(double valor){
         if(valor > 0 && valor <= this.getSaldo()){
             Movimento m = new Movimento(valor, TipoMovimento.DEBITO);
             this.movimentos.add(m);
             this.setSaldo(this.getSaldo() - valor);
        }
        
    }
    public void transferir(ContaBancaria contaDestino, double valor){
         this.sacar(valor);
         contaDestino.depositar(valor);
    }
    
    protected void incluirMovimento(Movimento m){
        movimentos = new ArrayList<>();
        this.movimentos.add(m);
        
    }
    
    
    
   
    
}

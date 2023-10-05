/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class Vendedor extends Funcionario {

    
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList();

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void incluirVenda(Venda v){
        this.vendas.add(v);
        
    }
    
    @Override
    public double calcularSalario(){
        
       double valorVendas = 0;
       for (Venda v: vendas){
           valorVendas += v.getValor();
       }
       
       double salario = this.getSalarioBase() + valorVendas * (this.getPercentualComissao() / 100);
      
        return salario;
    }
    
    @Override
    public String toString() {
        return "Vendedor: " + "percentualComissao=" + percentualComissao;
    }
    
}

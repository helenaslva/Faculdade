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
public class Venda {

    private Vendedor vendedor;
    private Cliente cliente;
    private TipoEntrega tipoEntrega;
    private ArrayList<Produto> produtos = new ArrayList();

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void inserirProduto(Produto p) {
        if (this.getProdutos().size() == 10) {
            throw new IllegalArgumentException("Esta venda possui o número máximo de produtos");
        } else {
            this.getProdutos().add(p);
        }
    }

    public double calcularValorEntrega() {
        if (this.getTipoEntrega() == null) {
            throw new IllegalArgumentException("O tipo de entrega deve ser setado");
        } else {
            double valor = 0;
            double pesoTotal = 0;
            if (this.getTipoEntrega() == TipoEntrega.RETIRADA_LOCAL) {
                valor = 0.0;
            } else if (this.getTipoEntrega() == TipoEntrega.SEDEX) {
                for (Produto p : produtos) {
                    pesoTotal += p.getPeso();
                }
                valor = 10 + (0.025 * pesoTotal);
            } else if (this.getTipoEntrega() == TipoEntrega.ENCOMENDA_PAC) {
                valor = 7.75;
            }
            return valor;
        }
    }

    public double calcularValorPordutos() {

        if (this.getProdutos() == null) {
            throw new IllegalArgumentException("Nenhum produto cadastrado");
        } else {
            double valorTotal = 0;
            for (Produto p : produtos) {
                valorTotal += p.getValor();
            }
            if (this.getCliente() == null) {
                throw new IllegalArgumentException("Não existe cliente para esta venda");
            } else {
                if (this.getCliente().isMesAniversario() == true) {
                    valorTotal = (valorTotal - 0.05);
                }
                return valorTotal;
            }
            
        }
       

    }
    
    public double calcularComissao(){
        if(this.getVendedor() == null){
            throw new IllegalArgumentException("Não há vendedor para esta venda");
        }else{
             double comissao = this.calcularValorPordutos() * (this.getVendedor().getPercentualComissao()/100);
             return comissao;
        }
         
    }

}

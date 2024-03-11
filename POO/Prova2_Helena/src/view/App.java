package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import model.Teclado;
import java.time.LocalDate;
import model.Cliente;
import model.Produto;

import model.TipoEntrega;
import model.Venda;
import model.Vendedor;
/**
 *
 * @author helenas
 */
public class App {
    
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        
        Venda minhaVenda = new Venda();
        
        boolean finalizarSistema = false;
        
        while (!finalizarSistema) {            
            System.out.println("************ SISTEMA DE VENDAS ***************");
            System.out.println("____Inclusão de Nova venda");
        
            System.out.println(" 1 - Definir Cliente");
            System.out.println(" 2 - Definir Vendedor");
            System.out.println(" 3 - Definir Tipo de Entrega");
            System.out.println(" 4 - Incluir Produto");
            System.out.println(" 5 - FINALIZAR VENDA");
            int opcao = teclado.lerInt();
            
            switch(opcao){
                case 1 :
                    System.out.println(" *** INFORME OS DADOS DO CLIENTE ***");
                    System.out.println(" *** Nome: ");
                    String nome = teclado.lerString();
                    System.out.println(" *** Data Nascimento (dd/mm/aaaa): ");
                    LocalDate dataNascimento = teclado.lerData();
                                        
                    Cliente cliente = new  Cliente(nome, dataNascimento);
                    minhaVenda.setCliente(cliente);

                    break;
                case 2 :
                    try{
                        System.out.println(" *** INFORME OS DADOS DO VENDEDOR ***");
                        System.out.println(" *** Nome: ");
                        String nomeVendedor = teclado.lerString();
                    
                              System.out.println(" *** Data Nascimento (dd/mm/aaaa): ");
                        LocalDate dataNascimentoVendedor = teclado.lerData();
                        
                        System.out.println(" *** Percentual Comissão: ");
                        double percComissao = teclado.lerDouble();

                        Vendedor vendedor = new  Vendedor(nomeVendedor, 
                                                          dataNascimentoVendedor,
                                                          percComissao);
                        minhaVenda.setVendedor(vendedor);
                        }catch(Exception e){
                            System.out.println("Digite uma data válida");
                        }
                      
                   
                        
                                                    
                    break;
                case 3 :
                        System.out.println(" *** SELECIONE O TIPO DE ENTREGA ***");
                        System.out.println(" *** 1 - Retirada no Local ");
                        System.out.println(" *** 2 - Sedex ");
                        System.out.println(" *** 3 - Encomenda Pac ");
                        int tipoEntrega = teclado.lerInt();
                        
                        if (tipoEntrega == 1){
                          minhaVenda.setTipoEntrega(TipoEntrega.RETIRADA_LOCAL);
                        }else if (tipoEntrega == 2){
                          minhaVenda.setTipoEntrega(TipoEntrega.SEDEX);
                        }else if (tipoEntrega == 3){
                          minhaVenda.setTipoEntrega(TipoEntrega.ENCOMENDA_PAC);
                        }
                        
                        
                                                    
                    break;
                case 4 :
                        System.out.println(" *** SELECIONE OS DADOS DO PRODUTO PARA INCLUSÃO ***");
                        System.out.println(" *** Descrição: ");
                        String descricao = teclado.lerString();
                        System.out.println(" *** Peso: ");
                        int peso = teclado.lerInt();
                        System.out.println(" *** Valor: ");
                        double valor = teclado.lerDouble();
                        
                        minhaVenda.inserirProduto(new Produto(descricao, peso, valor));
                                                    
                    break;
                
                case 5 :
                        double valorProdutos = minhaVenda.calcularValorPordutos();
                        double valorEntrega = minhaVenda.calcularValorEntrega();
                        double valorComissao = minhaVenda.calcularComissao();
                        
                    
                        System.out.println(" *** FINALIZANDO VENDA ***");
                                                
                        System.out.println(" _______ INFORMAÇÕES DO CLIENTE _______ ");
                        
                        System.out.println(" Cliente: "+ minhaVenda.getCliente().getNome());
                        System.out.println(" _______ INFORMAÇÕES DA ENTREGA _______ ");
                        System.out.println(" Tipo de Entrega: "+ minhaVenda.getTipoEntrega().toString());
                        System.out.println(" Valor da Entrega: R$ "+ minhaVenda.calcularValorEntrega());
                        System.out.println(" _______ INFORMAÇÕES DO VENDEDOR(A) _______ ");
                        System.out.println(" Vendedor: "+ minhaVenda.getVendedor().getNome());
                        System.out.println(" Percentual de Comissão: "+ minhaVenda.getVendedor().getPercentualComissao());
                        System.out.println(" Valor da Comissão: "+ valorComissao);
                        
                        System.out.println(" _______ ITENS DA VENDA _______ ");
                        for (Produto p : minhaVenda.getProdutos()){
                            System.out.println(" --- Produto: "+ p.getDescricao()+
                                               " Peso: "+ p.getPeso()+
                                               " Valor: R$ "+ p.getValor());
                        
                        }
                        System.out.println(" _______ TOTALIZAÇÃO DA VENDA _______ ");
                        System.out.println(" VALOR ENTREGA: R$ "+ valorEntrega);
                        System.out.println(" VALOR VENDA: R$ "+ valorProdutos);
                        System.out.println(" TOTAL A PAGAR PELO CLIENTE: R$ "+ (valorEntrega+ valorProdutos));
                        finalizarSistema = true;
                    break;
                
                    
            }
               
        }
                
        
        
    }
    
    
}

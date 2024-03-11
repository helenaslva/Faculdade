/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 * 
 * 
 *
 *
 * @author helenas
 */
public class SetorPessoal {
    Funcionario[] func;

    public SetorPessoal(int totalFuncionarios) {
       func = new Funcionario[totalFuncionarios];
       this.indice = 0;
    }


    private int indice;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public void incluirFuncionario(Funcionario funcionario) {
        if(func.length > indice){
           func[indice] = funcionario; 
          indice++;
        }
    }
    
    public void imprimirFolhaPagamento(){
        System.out.println("********* FOLHA DE PAGAMENTO ********");
        for(int i =0; i < indice; i++){
            System.out.println("Nome: " + func[i].getNome());
            System.out.println("Salário " + func[i].getSalario());
        }
    }
    public double retornaValorTotalFolha(){
        double valorTotal = 0;
            for(int i =0; i < func.length; i++){
                valorTotal += func[i].getSalario();
             }
            
         return valorTotal; 
    }
    
    public String retornaMaiorSalario(){
        double maiorSalario = 0; 
        Funcionario funcionarioMaiorSalario = new Funcionario();
         for(int i =0; i <indice; i++){
             if(func[i].getSalario() > maiorSalario){
                 maiorSalario = func[i].getSalario();
                 funcionarioMaiorSalario = func[i];
             }
         }
         return funcionarioMaiorSalario.getNome();
    }
    public String retornaFuncionariosDepartamento(int departamento){
        String funcionariosDpt = "Funciomários do departamento" + departamento;
        for(int i =0; i < indice; i++){
            if(func[i].getDepartamento() == departamento){
                funcionariosDpt += func[i].getNome() + "\n" + func[i].getFuncao();
              
            }
        }
        return funcionariosDpt;
    }
//    
//    public void imprimeFolhaOrdemCrescenteSalario(){
//        Funcionario[] funcOrdenados = new Funcionario[func.length];
//        
//        
//        for(int i = 0; i<indice; i++){
//            if(func[i].getSalario() > func[i+1].getSalario()){
//                func[i + 1] = funcOrdenados[];
//                
//            }
//        }
//        
//        for(int i = 0; i< contador; i++){
//            System.out.println("Nome: " + funcOrdenados[i].getNome());
//            System.out.println("Salário: " + funcOrdenados[i].getSalario());
//        }
//        
//    }
    

    
}

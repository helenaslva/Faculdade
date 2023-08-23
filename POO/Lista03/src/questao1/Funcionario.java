/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 * Representa um funcionário
 * @author Robson Walter de Souza
 */
public class Funcionario {
   private String nome;
   private double salario;
   
   
   public void setNome(String nome){
     this.nome =  nome;  
   }
   public String getNome(){
     return nome;  
   }
   public void setSalario(double salario){
       this.salario = salario;
   }
   
   public double getSalario(){
       return salario;
   }
   /**
    * Método que calcular o imposto de renda do funcionário
    * com base no salário e na lista de classificação de 
    * imposto de renda abaixo:
    * <ul>
    *   <ul> Faixa Faixa de Salário Alíquota</ul>
    *   <ul> 1ª Faixa Até R$ 1.903,98 Isento</ul>
    *   <ul> 2ª Faixa De R$ 1.903,99 à R$ 2.826,65 <b>7,5%</b></ul>
    *   <ul> 3ª Faixa De R$ 2.826,66 à R$ 3.751,05 15,0%</ul>
    *   <ul> 4ª Faixa De R$ 3.751,06 à R$ 4.664,68 22,5%</ul>
    *   <ul> 5ª Faixa A partir de R$ 4.664,69 27,5%</ul>
    * </ul>
    * @return Valor do imposto de renda a pagar pelo funcionário 
    */
   public double calcularIrpf(){
     double imposto = 0, diferenca = 0;
     //somente calcular imposto se salario maior que 
     //valor da 1ª faixa, pois é isento de imposto          
     if (getSalario() >  1903.98){         
         if (getSalario() <= 2826.65){// 2ª faixa 
            diferenca = (getSalario() - 1903.98);  
            imposto = diferenca * (7.5/100);
         }else if (getSalario() <= 3751.05){// 3ª Faixa
            //calcular imposto na faixa 2
            diferenca = (2826.65  - 1903.98);  
            imposto = diferenca * (7.5/100); 
            
            //calcular imposto na faixa 3
            diferenca = (getSalario()  - 2826.65 );  
            imposto += (diferenca * (15.0/100));                      
         }else if (getSalario() <= 4664.68){//4ª Faixa
             //calcular imposto na faixa 2
            diferenca = (2826.65  - 1903.98);  
            imposto = diferenca * (7.5/100); 
            
            //calcular imposto na faixa 3
            diferenca = (3751.05 - 2826.65 );  
            imposto += (diferenca * (15.0/100));  
            
            //calcular imposto na faixa 4            
            diferenca = (getSalario() - 3751.05);
            imposto += (diferenca * (22.5/100));                      
         }else{//5ª Faixa
             //calcular imposto na faixa 2
            diferenca = (2826.65  - 1903.98);  
            imposto = diferenca * (7.5/100); 
            
            //calcular imposto na faixa 3
            diferenca = (3751.05 - 2826.65 );  
            imposto += (diferenca * (15.0/100));  
            
            //calcular imposto na faixa 4            
            diferenca = (4664.68 - 3751.05);
            imposto += (diferenca * (22.5/100));
            
            //calcular imposto na faixa 5 
             diferenca = (getSalario() - 4664.68);
             imposto += (diferenca * (27.5/100));
             
         }
         
     }
     
     
       
     return imposto;  
   }
}

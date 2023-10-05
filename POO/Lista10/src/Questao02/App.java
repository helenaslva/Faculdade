/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        
    Funcionario [] funcionarios = new Funcionario[7];
    Empresa empresa = new Empresa("TMG");
    funcionarios[0] = new Vendedor("Luiz", 1000);
    funcionarios[1] = new Vendedor("Paulo", 1200);
    
    ((Vendedor) funcionarios[0]).setPercentualComissao(10);
    ((Vendedor) funcionarios[1]).setPercentualComissao(7);
    
    Venda venda1 = new Venda(200);
    Venda venda2 = new Venda(100);
    Venda venda3 = new Venda(500);
    Venda venda4= new Venda(350);
    Venda venda5= new Venda(280);
    
    
     ((Vendedor) funcionarios[0]).incluirVenda( venda1);
     ((Vendedor) funcionarios[0]).incluirVenda( venda2);
     ((Vendedor) funcionarios[1]).incluirVenda( venda3);
     ((Vendedor) funcionarios[1]).incluirVenda( venda4);
     ((Vendedor) funcionarios[1]).incluirVenda( venda5);
     
    funcionarios[2] = new Programador("Julio", 1000);
    funcionarios[3] = new Programador("Ana", 1000);
    funcionarios[4] = new Programador("Anderson", 1200);
    
    ((Programador) funcionarios[2]).incluirLinguagem("C");
    ((Programador) funcionarios[2]).incluirLinguagem("Java");
    ((Programador) funcionarios[3]).incluirLinguagem("Java");
    ((Programador) funcionarios[3]).incluirLinguagem("C#");
    ((Programador) funcionarios[4]).incluirLinguagem("Phyton");
    
    funcionarios[5] = new Funcionario("José", 1000);
    funcionarios[6] = new Funcionario("Maria", 1400);
    
   for(int i = 0; i < funcionarios.length; i++){
       empresa.incluirFuncionario(funcionarios[i]);
      
   }
    for(int i = 0; i < funcionarios.length; i++){
        System.out.println( funcionarios[i].toString());
      
      
   }
    
    System.out.println("O custo total de salário da emrpesa " + empresa.getNome() + " é de: R$ " + empresa.calcularCustosSalario());

    }
    
    
 
}

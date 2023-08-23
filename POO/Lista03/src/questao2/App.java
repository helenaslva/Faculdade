/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.text.DecimalFormat;
import java.util.Scanner;
import questao1.Funcionario;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Funcionario[] vetFuncionarios = new Funcionario[5];
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("***** CADASTRO DE FUNCIONARIOS ****");
        for (int i = 0; i < vetFuncionarios.length;i++){
            System.out.println("Informe o nome do "+(i+1)+"º Funcionário:");
            String nome = teclado.nextLine();
        
            System.out.println("Informe o salário do "+(i+1)+"º Funcionário:");
            double salario =  Double.parseDouble(teclado.nextLine());
        
            Funcionario func1 = new Funcionario();
            func1.setNome(nome);
            func1.setSalario(salario);
            
            vetFuncionarios[i] = func1;
         
        }
       
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        
        for (int i = 0; i < vetFuncionarios.length;i++){
             System.out.println(" Nome: "+vetFuncionarios[i].getNome()+
                                " Salario: "+df.format(vetFuncionarios[i].getSalario())+
                                " IRPF: "+ df.format(vetFuncionarios[i].calcularIrpf()));
        }
       
    }
   
}

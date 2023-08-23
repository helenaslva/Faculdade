/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome do Funcionário:");
        String nome = teclado.nextLine();
        
        System.out.println("Informe o salário do Funcionário:");
        double salario =  Double.parseDouble(teclado.nextLine());
        
        
        Funcionario func1 = new Funcionario();
        func1.setNome(nome);
        func1.setSalario(salario);
        
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        
        System.out.println("O IRPF do funcionário é: "+
                           df.format(func1.calcularIrpf()));
        
       
    }
}

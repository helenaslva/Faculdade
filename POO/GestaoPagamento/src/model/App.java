package model;


import model.Funcionario;
import model.SetorPessoal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        SetorPessoal setorPessoal = new SetorPessoal(3);
        
        Funcionario func1 = new Funcionario(0, "Helena", 1, 3498, "Dev Pleno");
        Funcionario func2 = new Funcionario(1, "Luana", 1, 2800, "Dev Jr");
        Funcionario func3 = new Funcionario(2, "Beatriz", 1, 1600, "Estagiario");
        
        setorPessoal.incluirFuncionario(func1);
        setorPessoal.incluirFuncionario(func2);
        setorPessoal.incluirFuncionario(func3);
        
        System.out.println(setorPessoal.retornaValorTotalFolha());
        System.out.println(setorPessoal.retornaFuncionariosDepartamento(1));
        System.out.println(setorPessoal.retornaMaiorSalario());
        
        
      
    }
    
}

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
public class Empresa {
    private String nome; 
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void incluirFuncionario(Funcionario f){
        this.getFuncionarios().add(f);
    }
    public void removerFuncionarios(Funcionario f){
        this.getFuncionarios().remove(f);
    }
    
    public double calcularCustosSalario(){
        double valorTotal = 0;
        for(Funcionario f: funcionarios){
            valorTotal += f.calcularSalario();
            
        }
        
        return valorTotal;
    }
    
}

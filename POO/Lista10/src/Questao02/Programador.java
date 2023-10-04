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
public class Programador extends Funcionario{

 
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
    private ArrayList<String> linguagens = new ArrayList();
    
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
   
    public void incluirLinguagem(String linguagem){
        this.getLinguagens().add(linguagem);
    }
    public void excluirLinguagem(String linguagem){
        this.getLinguagens().remove(linguagem);
    }
    @Override
    public double calcularSalario(){
        double salario = this.getSalarioBase();
        for(String linguagem: linguagens){
            if(linguagem.equals("Java")){
                salario += (this.getSalarioBase() * 0.2);
            }
        }
        
        return salario;
    }
      @Override
    public String toString() {
        return "Programador{" + "linguagens=" + linguagens + '}';
    }
    
}

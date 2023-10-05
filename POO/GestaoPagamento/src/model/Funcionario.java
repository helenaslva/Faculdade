/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class Funcionario {

    public Funcionario() {
    }

    public Funcionario(int matricula, String nome, int departamento, double salario, String funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }


    private int matricula; 
    private String nome; 
    private int departamento; 
    private double salario; 
    private String funcao; 


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
 
    
}

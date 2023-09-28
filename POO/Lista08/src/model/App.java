/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author helenas
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Helena");
        aluno.setNotaEnem(6.7);
        Aluno aluno2 = new Aluno();
        aluno.setNome("Julia");
        aluno.setNotaEnem(6.8);
        
        Turma turma = new Turma();
        turma.incluirAluno(aluno);
        turma.incluirAluno(aluno2);
        System.out.println(turma.obterAlunoMelhorNotaEnem());
                
        
    }
    
}

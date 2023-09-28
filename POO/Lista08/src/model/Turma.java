/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author helenas
 */
public class Turma {

    public Turma() {
       this.alunos = new ArrayList<>();
    }
    
    private String disciplina; 
    private Aluno aluno; 
    private Turno turno; 
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        
        return alunos;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public void incluirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public void excluirAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
       Aluno alunoMaiorNota = new Aluno();
       Aluno aluno = new Aluno();
       alunoMaiorNota = null; 
       double maiorNota = 0.0;
       
       for(int i = 0; i < this.alunos.size(); i++){
           aluno = this.alunos.get(i);
           if(aluno.getNotaEnem()>maiorNota){
               maiorNota = aluno.getNotaEnem();
               alunoMaiorNota = aluno;
           }
       }
       return alunoMaiorNota;
    }
    
 
    
}

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
    
    private String disciplina;
    private Professor professor; 
    private ArrayList<Aluno> alunos = new ArrayList();
    private Turno turno; 

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public void incluirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
     public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
         Aluno alunoMelhorNota = this.getAlunos().get(0);
        if (getAlunos().size() == 0){
            return null;
        }else{
       
        
        for(Aluno a: getAlunos()){
            if(a.getNotaEnem() > alunoMelhorNota.getNotaEnem()){
                alunoMelhorNota = a; 
            }
        }
        }
        return alunoMelhorNota;
    }

    
}

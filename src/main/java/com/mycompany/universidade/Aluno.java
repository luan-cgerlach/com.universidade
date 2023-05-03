package com.mycompany.universidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int codigo;
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Disciplina> disciplinasMatriculadas;
    
    public Aluno() {
        disciplinasMatriculadas = new ArrayList<>();
    }

    public Aluno(int codigo, String nome, String matricula, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricularDisciplina(Disciplina disciplina) {
        if(verificarDuplacidadeDeDisiplinas(disciplina) == true && verificarQuantidadeDeDisciplinas() == true){
        disciplinasMatriculadas.add(disciplina);
        }else{
            System.out.println("Voçê já esta matriculado em cinco disciplinas, ou nessa");
        }
    }
    
    public boolean verificarQuantidadeDeDisciplinas() {
        return disciplinasMatriculadas.size()<5;
    }
    
    public boolean verificarDuplacidadeDeDisiplinas(Disciplina disciplina) {
        return !disciplinasMatriculadas.contains(disciplina);
    }
    
    public void listarDisciplinas () {
        System.out.println(disciplinasMatriculadas.toString() 
        + "/n faltam " +(curso.getDisciplinas().size() - disciplinasMatriculadas.size())+ " disciplinas");
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", disciplinasMatriculadas=" + disciplinasMatriculadas + '}';
    }
 
}

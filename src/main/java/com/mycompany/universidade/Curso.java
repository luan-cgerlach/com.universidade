package com.mycompany.universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Curso() {
    }

    public Curso(int codigo, String nome, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = disciplinas;
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", disciplinas=" + disciplinas + '}';
    }
    
    
}

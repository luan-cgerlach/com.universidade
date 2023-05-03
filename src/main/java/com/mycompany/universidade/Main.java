package com.mycompany.universidade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Disciplina algoritmos = new Disciplina(100, "Algoritmos", 50);
        Disciplina algoritmos2 = new Disciplina(107, "Algoritmos 2", 50);
        Disciplina matematica = new Disciplina(101, "Matemarica", 50);
        Disciplina matematica2 = new Disciplina(102, "Matematica 2", 50);
        Disciplina java = new Disciplina(103, "Java", 50);
        Disciplina java2 = new Disciplina(104, "Java 2", 50);
        Disciplina c = new Disciplina(105, "C", 50);
        Disciplina c2 = new Disciplina(106, "C 2", 50);
        Disciplina logica = new Disciplina(108, "Logica", 50);
        Disciplina logica2 = new Disciplina(109, "Logica 2", 50);
        
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(algoritmos);
        disciplinas.add(algoritmos2);
        disciplinas.add(matematica);
        disciplinas.add(matematica2);
        disciplinas.add(java);
        disciplinas.add(java2);
        disciplinas.add(c);
        disciplinas.add(c2);
        disciplinas.add(logica);
        disciplinas.add(logica2);
        
        Curso cienciaDaComputacao = new Curso(10, "Ciencia da Computação", disciplinas);

        Aluno luan = new Aluno(1000, "Luan","Sim" , cienciaDaComputacao);
        luan.matricularDisciplina(logica);
        luan.matricularDisciplina(logica2);
        luan.matricularDisciplina(java);
        luan.listarDisciplinas();
        
        Aluno eduardo = new Aluno(1001, "Eduardo","Sim" , cienciaDaComputacao);
        eduardo.matricularDisciplina(logica);
        eduardo.matricularDisciplina(logica2);
        eduardo.matricularDisciplina(algoritmos);
        eduardo.matricularDisciplina(algoritmos2);
        eduardo.matricularDisciplina(matematica);
        eduardo.matricularDisciplina(matematica2);
        eduardo.listarDisciplinas();
        
        Aluno vinicius = new Aluno(1002, "Vinicius","Sim" , cienciaDaComputacao);
        Aluno moacir = new Aluno(1003, "Moacir","Sim" , cienciaDaComputacao);
        Aluno henrique = new Aluno(1004, "Henrique","Sim" , cienciaDaComputacao);
        Aluno gean = new Aluno(1005, "Gean","Sim" , cienciaDaComputacao);
        Aluno tauhan = new Aluno(1006, "Tauhan","Sim" , cienciaDaComputacao);
        Aluno kaiane = new Aluno(1007, "Kaiane","Sim" , cienciaDaComputacao);
        Aluno luiza = new Aluno(1008, "Luiz","Sim" , cienciaDaComputacao);
        Aluno estefani = new Aluno(1009, "Estefani","Sim" , cienciaDaComputacao);
        Aluno Eduarda = new Aluno(1010, "Eduarda","Sim" , cienciaDaComputacao);
    
    
    }
}

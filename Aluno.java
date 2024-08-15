package com.aula06.aula10;

public class Aluno extends Pessoa { //"extends" significa que "Aluno" é uma classe filha da classe "Pessoa", ou seja, herda todos os atributos e métodos de "Pessoa"
    private int matr;
    private String curso;

    //Métodos
    public void cancelarMatr() {

    }

    //Acessores
    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}

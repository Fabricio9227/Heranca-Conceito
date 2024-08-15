package com.aula06.aula10;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniver() {
        setIdade(getIdade() + 1);
    }
    //Acessores getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String se) {
        this.sexo = se;
    }
}

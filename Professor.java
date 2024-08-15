package com.aula06.aula10;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salário;

    //Método
    public void receberAum() {

    }

    //Acessores
    public String getEspec() {
        return especialidade;
    }
    public void setEspec(String esp) {
        this.especialidade = esp;
    }
    public float getSal() {
        return salário;
    }
    public void setSal(int sal) {
        this.salário = sal;
    }
}

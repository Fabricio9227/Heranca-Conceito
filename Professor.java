package com.aula06.aula10;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salário;

    //Método
    public void receberAum(float aum) {
        this.salário = getSal() + aum;
        System.out.println("Seu salário agora é de " + this.salário);
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

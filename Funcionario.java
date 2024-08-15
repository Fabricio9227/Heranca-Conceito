package com.aula06.aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //Método
    public void mudarTrabalho() {

    }

    //Acessores
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrab() {
        return trabalhando;
    }
    public void setTrab(boolean trab) {
        this.trabalhando = trab;
    }
}

package com.aula06.aula10;

public class Aula10 {
    public static void main(String[] args) {
        //Programa princiapl
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
    
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Julio");
       p4.setNome("Gustavo");

       p2.setIdade(43);
       p4.setIdade(30);
       p2.setSexo("M");
       p4.setSexo("F");


       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());

    }
}

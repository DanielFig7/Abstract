package com.sovos.abstracao.abs;

public abstract class Employee {

    private String nome;
    private String familia;

    public Employee(String nome, String familia) {
        this.nome = nome;
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return  nome + "" +
                familia;
    }

    public abstract double ganhar();

}

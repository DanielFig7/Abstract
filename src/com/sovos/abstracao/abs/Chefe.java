package com.sovos.abstracao.abs;

public class Chefe extends Employee{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Chefe(String nome, String familia, double salario) {
        super(nome, familia);
        setSalario(salario);
    }

    @Override
    public String toString() {
        return "Chefe: " + super.toString();
    }

    @Override
    public double ganhar() {
        return getSalario();
    }
}

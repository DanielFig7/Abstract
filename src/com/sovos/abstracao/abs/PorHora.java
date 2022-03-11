package com.sovos.abstracao.abs;

public class PorHora extends Employee {
    private double valor;
    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public PorHora(String nome, String familia, double valor, double horas) {
        super(nome, familia);
        this.valor = valor;
        this.horas = horas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double ganhar() {
        return getHoras()*getValor();
    }

    @Override
    public String toString() {
        return "PorHora: " +
                super.toString();
    }
}

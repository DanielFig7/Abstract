package com.sovos.abstracao.abs;

public class PorComissao extends Employee {

    private double salario, comissao;
    private int vendas;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public PorComissao(String nome, String familia, double salario, double comissao, int vendas) {
        super(nome, familia);
        setSalario(salario);
        setComissao(comissao);
        setVendas(vendas);
    }

    @Override
    public String toString() {
        return "PorComissao: "+super.toString();
    }

    @Override
    public double ganhar() {
        return getSalario()+getComissao()*getVendas();
    }
}

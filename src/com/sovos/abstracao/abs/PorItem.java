package com.sovos.abstracao.abs;

public class PorItem extends Employee{

    private double producao;
    private int quantidade;

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public PorItem(String nome, String familia, double producao, int quantidade) {
        super(nome, familia);
        setProducao(producao);
        setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "PorItem: "+ super.toString();
    }

    @Override
    public double ganhar() {
        return getProducao()*getQuantidade();
    }
}

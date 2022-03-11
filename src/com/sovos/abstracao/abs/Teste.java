package com.sovos.abstracao.abs;

import java.text.DecimalFormat;

public class Teste {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Chefe ch = new Chefe("nome", "familia", 50000);
        PorComissao pc = new PorComissao("Por","Comissao", 2500, 50,20);
        PorHora ph = new PorHora("Por","Hora",150,180);
        PorItem pi = new PorItem("Por","Item", 900,20);
        System.out.println(ch.toString()+" ganha $" + df.format(ch.ganhar()));
        System.out.println(pc.toString()+" ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString()+" ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString()+" ganha $" + df.format(ph.ganhar()));
    }

}

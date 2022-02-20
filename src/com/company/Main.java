package com.company;

public class Main {

    public static void main(String[] args) {
	// Strategy
        AtivarModo bomDia = new AtivarBomDia();
        AtivarModo dormir = new AtivarDormir();
        AtivarModo drink = new AtivarDrink();
        AtivarModo jogo = new AtivarJogo();
        AtivarModo netflix = new AtivarNetflix();
        AtivarModo protegerCasa = new AtivarProtegerCasa();

        Casa casa = new Casa();

        casa.setStrategy(bomDia);
        casa.ativarModo();

        casa.setStrategy(dormir);
        casa.ativarModo();

        casa.setStrategy(drink);
        casa.ativarModo();

        casa.setStrategy(jogo);
        casa.ativarModo();

        casa.setStrategy(netflix);
        casa.ativarModo();

        casa.setStrategy(protegerCasa);
        casa.ativarModo();
    }
}

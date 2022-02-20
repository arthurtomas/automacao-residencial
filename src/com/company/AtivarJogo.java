package com.company;

public class AtivarJogo implements AtivarModo {
    @Override
    public void ativarModo() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Modo Jogo Ativado: ");
        System.out.println("Lâmpadas funcionando com 20% do brilho.");
        System.out.println("Tv foi ligada.");
        System.out.println("Playstation 5 ligado.");
    }
}

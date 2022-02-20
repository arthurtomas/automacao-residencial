package com.company;

public class AtivarDrink implements AtivarModo {
    @Override
    public void ativarModo() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Modo Drink Ativado: ");
        System.out.println("Lâmpadas funcionando com 70% do brilho.");
        System.out.println("Luzes ambiente ligadas.");
        System.out.println("Ar condicionado foi ligado.");
        System.out.println("Temperatura do ar condicionado em 18ºC.");
    }
}

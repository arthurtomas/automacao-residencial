package com.company;

public class AtivarDormir implements AtivarModo {

    @Override
    public void ativarModo() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Modo Dormir Ativado: ");
        System.out.println("Todas as lâmpadas foram desligadas.");
        System.out.println("Ar condicionado foi ligado.");
        System.out.println("Temperatura do ar condicionado em 19ºC.");
    }
}

package com.company;

public class AtivarProtegerCasa implements AtivarModo {
    @Override
    public void ativarModo() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Modo Proteger Casa Ativado: ");
        System.out.println("Todas as lâmpadas foram desligadas.");
        System.out.println("Sistema de alarme ligado.");
        System.out.println("Cameras infravermelho ligadas.");
        System.out.println("Coleira do cachorro foi aberta.");
    }
}

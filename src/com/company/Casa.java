package com.company;

public class Casa {
    private AtivarModo strategy;

    public void setStrategy(AtivarModo strategy) {
        this.strategy = strategy;
    }

    public void ativarModo(){
        strategy.ativarModo();
    }
}

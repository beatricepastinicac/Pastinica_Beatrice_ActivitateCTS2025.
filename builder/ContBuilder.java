package cts.beatrice.ex.gr1118.builder;

import java.util.EnumSet;

public class ContBuilder implements ICont {

    private String numeUtilizator;
    private TipAbonament tipAbonament;
    private int pret;
    private EnumSet<BeneficiiExtra> beneficiiExtra= EnumSet.noneOf(BeneficiiExtra.class);
    private int durataAbonament;


    public ContBuilder() {

    }

    public  ContBuilder setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
        return this;
    }

    public  ContBuilder setTipAbonament(TipAbonament tipAbonament) {
        this.tipAbonament = tipAbonament;
        return this;
    }

    public ContBuilder  setPret(int pret) {
        this.pret = pret;
        return this;
    }

    public ContBuilder setBeneficiiExtra(EnumSet<BeneficiiExtra> beneficiiExtra) {
        this.beneficiiExtra = beneficiiExtra;
        return this;
    }

    public ContBuilder setDurataAbonament(int durataAbonament) {
        this.durataAbonament = durataAbonament;
        return this;
    }

    @Override
    public Cont buid() {
        Cont cont = new Cont(numeUtilizator, tipAbonament, pret, beneficiiExtra, durataAbonament);
        return cont;
    }
}

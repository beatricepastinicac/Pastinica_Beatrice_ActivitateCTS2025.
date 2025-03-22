package cts.beatrice.ex.gr1118.builder;

import java.util.EnumSet;

public class Cont {
    private String numeUtilizator;
    private TipAbonament tipAbonament;
    private int pret;
    //private List<String> beneficiiExtra= new ArrayList<>();
    private EnumSet<BeneficiiExtra> beneficiiExtra;
    private int durataAbonament;


    public Cont(TipAbonament tipAbonament, int durataAbonament) {
        this.tipAbonament=tipAbonament;
        this.durataAbonament=durataAbonament;
    }

    public Cont(String numeUtilizator, TipAbonament tipAbonament, int pret, EnumSet<BeneficiiExtra> beneficiiExtra, int durataAbonament) {
        this.numeUtilizator = numeUtilizator;
        this.tipAbonament = tipAbonament;
        this.pret = pret;
        this.beneficiiExtra = beneficiiExtra;
        this.durataAbonament = durataAbonament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeUtilizator='").append(numeUtilizator).append('\'');
        sb.append(", tipAbonament=").append(tipAbonament);
        sb.append(", pret=").append(pret);
        sb.append(", beneficiiExtra=").append(beneficiiExtra);
        sb.append(", durataAbonament=").append(durataAbonament);
        sb.append('}');
        return sb.toString();
    }

    public int getDurataAbonament() {
        return durataAbonament;
    }

    public void setDurataAbonament(int durataAbonament) {
        this.durataAbonament = durataAbonament;
    }

    public EnumSet<BeneficiiExtra> getBeneficiiExtra() {
        return beneficiiExtra;
    }


    public void setBeneficiiExtra() {
        this.beneficiiExtra = beneficiiExtra;

    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public TipAbonament getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(TipAbonament tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }
}

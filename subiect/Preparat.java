package subiect;

public class Preparat {
    private String denumirePreparat;
    private int nrMinutePreparare;
    private int gradeGatire;


    public Preparat(String denumirePreparat, int gradeGatire, int nrMinutePreparare) {
        this.denumirePreparat = denumirePreparat;
        this.gradeGatire = gradeGatire;
        this.nrMinutePreparare = nrMinutePreparare;
    }

    public String getDenumirePreparat() {
        return denumirePreparat;
    }

    public int getNrMinutePreparare(){
        return nrMinutePreparare;
    }

    public int getGradeGatire(){
        return gradeGatire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparat{");
        sb.append("denumirePreparat='").append(denumirePreparat).append('\'');
        sb.append(", nrMinutePreparare=").append(nrMinutePreparare);
        sb.append(", gradeGatire=").append(gradeGatire);
        sb.append('}');
        return sb.toString();
    }
}

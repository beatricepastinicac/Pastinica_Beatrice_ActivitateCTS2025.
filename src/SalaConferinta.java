public class SalaConferinta {
    private String nume;
    private int capacitateMin=50;
    private int capacitateMax;
    private DotariSuplimentare dotariSuplimentare;

    public SalaConferinta() {
    }

    public SalaConferinta(String nume, int capacitateMin, int capacitateMax, DotariSuplimentare dotariSuplimentare) {
        this.nume = nume;
        this.capacitateMin = capacitateMin;
        this.capacitateMax = capacitateMax;
        this.dotariSuplimentare = dotariSuplimentare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCapacitateMin() {
        return capacitateMin;
    }


    public int getCapacitateMax() {
        return capacitateMax;
    }

    public void setCapacitateMax(int capacitateMax) {
        if(capacitateMax>= 2*capacitateMin){
        this.capacitateMax = capacitateMax;
        }else {
            try {
                throw new Exception("Capacitatea maxima trebuie sa fie macar de 100 de persoane");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public DotariSuplimentare getDotariSuplimentare() {
        return dotariSuplimentare;
    }

    public void setDotariSuplimentare(DotariSuplimentare dotariSuplimentare) {
        if(dotariSuplimentare==DotariSuplimentare.proiector && dotariSuplimentare!=DotariSuplimentare.priza){
            this.dotariSuplimentare=dotariSuplimentare;
        } else {
            try {
                throw new Exception("Sala trebuie sa aiba priza dedicata");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalaConferinta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capacitateMin=").append(capacitateMin);
        sb.append(", capacitateMax=").append(capacitateMax);
        sb.append(", dotariSuplimentare=").append(dotariSuplimentare);
        sb.append('}');
        return sb.toString();
    }
}

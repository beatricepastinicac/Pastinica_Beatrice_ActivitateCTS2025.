package subiecte.d.s3.chainOfResponsability;

public class Item {
    public enum Tip { IMAGINE, PARAGRAF }

    private Tip tip;
    private String continut;
    private boolean bold;
    private boolean italic;
    private String culoare;

    public Item(Tip tip, String continut, boolean bold, boolean italic, String culoare) {
        this.tip = tip;
        this.continut = continut;
        this.bold = bold;
        this.italic = italic;
        this.culoare = culoare;
    }

    public Tip getTip() { return tip; }
    public String getContinut() { return continut; }

    public void simplificaParagraf() {
        this.bold = false;
        this.italic = false;
        this.culoare = "negru";
    }

    public String toString() {
        return tip + ": " + continut + " [bold=" + bold + ", italic=" + italic + ", culoare=" + culoare + "]";
    }
}

package subiecte.d.s3.chainOfResponsability;

public abstract class Filtru {
    protected Filtru urmator;

    public void setUrmator(Filtru urmator) {
        this.urmator = urmator;
    }

    public abstract void aplica(PaginaWeb pagina);
}
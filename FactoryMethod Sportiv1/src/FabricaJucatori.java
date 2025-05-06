public class FabricaJucatori {
    public Jucator creareJucator(CategoriaJucator categoria, String nume) {
        switch (categoria) {
            case PORTAR:
                return new JucatorPortar(nume);
            case FUNDAS:
                return new JucatorFundas(nume);
            case ATACANT:
                return new JucatorAtacant(nume);
            default:
                throw new IllegalArgumentException("Categoria de jucator necunoscuta: " + categoria);
        }
    }
}

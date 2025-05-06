public class Main {
    public static void main(String[] args) {
        VerificarePersoanaFacade verificareFacade = new VerificarePersoanaFacade();
        String seriaBuletin = "12345";
        String codBilet = "ABCDE";
        verificareFacade.verificaPersoana(seriaBuletin, codBilet);
    }
}

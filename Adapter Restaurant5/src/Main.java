public class Main {
    public static void main(String[] args) {
        SoftNou softNou = new SoftNou();
        SoftBucatarie adapter = new AdapterSoftNouLaVechi(softNou);
        adapter.printeazaFacturaBucatarie("Detalii facturare pentru bucătărie.");
    }
}

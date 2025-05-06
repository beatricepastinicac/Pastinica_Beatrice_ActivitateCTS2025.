public class AdapterSoftNouLaVechi implements SoftBucatarie {
    private SoftNou softNou;

    public AdapterSoftNouLaVechi(SoftNou softNou) {
        this.softNou = softNou;
    }

    @Override
    public void printeazaFacturaBucatarie(String detalii) {
        softNou.printeazaFacturaBar(detalii);
    }
}

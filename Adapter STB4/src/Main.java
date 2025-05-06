public class Main {
    public static void main(String[] args) {
        ValidatorTransportTerestru validatorTransportTerestru = new ValidatorTransportTerestru();
        ValidatorTransportSubteran validatorTransportSubteran = new ValidatorTransportSubteran();

        ValidatorBilet validatorBiletSubteranAdapter = new ValidatorTransportSubteranAdapter(validatorTransportSubteran);

        boolean validTerestru = validatorTransportTerestru.valideazaBilet("123");
        System.out.println("Bilet transport terestru valid: " + validTerestru);

        boolean validSubteran = validatorBiletSubteranAdapter.valideazaBilet("456");
        System.out.println("Bilet transport subteran valid: " + validSubteran);
    }
}

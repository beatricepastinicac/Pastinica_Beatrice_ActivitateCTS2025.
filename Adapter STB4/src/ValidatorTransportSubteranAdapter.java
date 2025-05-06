public class ValidatorTransportSubteranAdapter implements ValidatorBilet {
    private ValidatorTransportSubteran validatorTransportSubteran;

    public ValidatorTransportSubteranAdapter(ValidatorTransportSubteran validatorTransportSubteran) {
        this.validatorTransportSubteran = validatorTransportSubteran;
    }

    public boolean valideazaBilet(String codBilet) {
        return validatorTransportSubteran.validareBiletSubteran(codBilet);
    }
}

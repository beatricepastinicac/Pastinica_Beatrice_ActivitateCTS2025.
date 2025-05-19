package adapterPlata;

public class LegacyPaymentGateway {
    public void makePayment(String account, double amount){
        System.out.println("Plata "+ amount+ "facuta din contul: "+account);
    }
}

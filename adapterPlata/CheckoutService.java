package adapterPlata;

public class CheckoutService {
    private PaymentProcesor paymentProcesor;

    public CheckoutService(PaymentProcesor paymentProcesor){
        this.paymentProcesor=paymentProcesor;
    }

    public void checkout(double totalAmount){
        System.out.println("Procesare...");
        if(paymentProcesor.processPayment(totalAmount)){
            System.out.println("Plata a fost procesata");

        }else{
            System.out.println("Plata a esuat, te rugam sa incerci din nou.");
        }
    }
}

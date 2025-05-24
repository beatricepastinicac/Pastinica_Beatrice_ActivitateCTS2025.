package subiecte.d.s10.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Elena");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege modul de cautare:\n1. Implicit\n2. Personalizat");
        String optiune = scanner.nextLine();

        if (optiune.equals("1")) {
            client.seteazaStrategieCautare(new ParametrizareImp());
        } else {
            client.seteazaStrategieCautare(new ParametrizareCustom());
        }

        client.cautaProduse();
    }
}

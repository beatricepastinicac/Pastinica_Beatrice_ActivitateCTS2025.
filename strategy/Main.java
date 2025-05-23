package subiecte.d.s11.strategy;

import subiecte.d.s11.chainOfResponsability.Bancnota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bancnota b50 = new Bancnota(50, 3);
        Bancnota b20 = new Bancnota(20, 4);
        Bancnota b10 = new Bancnota(10, 6);

        Client client = new Client("Radu");

        Scanner sc = new Scanner(System.in);
        System.out.println("Alege modul de retragere:\n1. Toate bancnotele\n2. Selectiv");
        String opt = sc.nextLine();

        if (opt.equals("1")) {
            client.seteazaStrategie(new StrategieToateBancnotele());
        } else {
            client.seteazaStrategie(new StrategieSelectiva());
        }

        client.retrage(130, b50, b20, b10);
    }
}

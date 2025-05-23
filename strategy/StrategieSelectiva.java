package subiecte.d.s11.strategy;

import subiecte.d.s11.chainOfResponsability.*;

import java.util.Scanner;

public class StrategieSelectiva implements IStrategieRetragere {
    public HandlerBancnote configureazaLant(Bancnota b50, Bancnota b20, Bancnota b10) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Include bancnote de 50? (y/n): ");
        boolean include50 = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("Include bancnote de 20? (y/n): ");
        boolean include20 = sc.nextLine().equalsIgnoreCase("y");

        System.out.print("Include bancnote de 10? (y/n): ");
        boolean include10 = sc.nextLine().equalsIgnoreCase("y");

        HandlerBancnote cap = null, curent = null;

        if (include50) {
            cap = curent = new HandlerBancnota50(b50);
        }
        if (include20) {
            HandlerBancnote nou = new HandlerBancnota20(b20);
            if (cap == null) cap = nou;
            else curent.setUrmator(nou);
            curent = nou;
        }
        if (include10) {
            HandlerBancnote nou = new HandlerBancnota10(b10);
            if (cap == null) cap = nou;
            else curent.setUrmator(nou);
        }

        return cap;
    }}

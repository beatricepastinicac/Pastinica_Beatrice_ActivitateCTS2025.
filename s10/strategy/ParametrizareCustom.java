package subiecte.d.s10.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParametrizareCustom implements ICautare {
    @Override
    public Map<String, Object> genereazaCriterii() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criterii = new HashMap<>();

        System.out.print("Introdu culoare dorita: ");
        String culoare = scanner.nextLine();
        if (!culoare.isEmpty()) {
            criterii.put("culoare", culoare);
        }

        System.out.print("Introdu marime (sau enter pentru skip): ");
        String marimeStr = scanner.nextLine();
        if (!marimeStr.isEmpty()) {
            try {
                criterii.put("marime", Integer.parseInt(marimeStr));
            } catch (NumberFormatException e) {
                System.out.println("Marime invalida. Se ignora.");
            }
        }

        System.out.print("Introdu brand (sau enter pentru skip): ");
        String brand = scanner.nextLine();
        if (!brand.isEmpty()) {
            criterii.put("brand", brand);
        }

        return criterii;
    }
}

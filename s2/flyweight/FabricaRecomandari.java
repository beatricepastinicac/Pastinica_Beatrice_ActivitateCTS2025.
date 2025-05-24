package subiecte.d.s2.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaRecomandari {
    private Map<String, RecomandareSanatate> recomandari = new HashMap<>();

    public RecomandareSanatate getRecomandare(String text) {
        if (!recomandari.containsKey(text)) {
            recomandari.put(text, new RecomandareSanatate(text));
        }
        return recomandari.get(text);
    }

    public int getNrRecomandari() {
        return recomandari.size();
    }
}

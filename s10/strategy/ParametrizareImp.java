package subiecte.d.s10.strategy;

import java.util.HashMap;
import java.util.Map;

public class ParametrizareImp implements ICautare {
    @Override
    public Map<String, Object> genereazaCriterii() {
        Map<String, Object> criterii = new HashMap<>();
        criterii.put("culoare", "negru");
        criterii.put("marime", 42);
        criterii.put("brand", "Nike");
        return criterii;
    }
}

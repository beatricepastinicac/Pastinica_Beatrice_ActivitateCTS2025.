import enums.ETipMaterial;
import enums.ETipPantof;

import java.util.List;

public abstract class APantof {
    protected ETipPantof tipPantof; //enum
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material; //enum
    protected List<ETipMaterial> materialeSuplimentare;
    protected List<String> listaMesajeText;

    public abstract float calculPret();
    protected abstract void addMesaj(String mesaj);
    protected abstract void addMaterial(ETipMaterial tipMaterial);
}

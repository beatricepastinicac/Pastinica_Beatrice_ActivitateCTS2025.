import enums.ETipMaterial;
import enums.ETipPantof;

import java.util.ArrayList;

public class Pantof extends APantof{

    Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial tipMaterial){
        this.tipPantof=tipPantof;
        this.nrPantof=nrPantof;
        this.dimensiuneToc=dimensiuneToc;
        this.material=tipMaterial;
        materialeSuplimentare=new ArrayList<>();
        listaMesajeText=new ArrayList<>();
    }


    @Override
    public float calculPret() {
        float pret=50;
        pret = pret + nrPantof*2;
        pret=pret + dimensiuneToc*3;
        pret=pret+materialeSuplimentare.size()*10;
        return pret;
    }

    @Override
    protected void addMesaj(String mesaj) {
        listaMesajeText.add(mesaj);
    }

    @Override
    protected void addMaterial(ETipMaterial tipMaterial) {
    this.materialeSuplimentare.add(tipMaterial);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("nrPantof=").append(nrPantof);
        sb.append(", tipPantof=").append(tipPantof);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", material=").append(material);
        sb.append(", materialeSuplimentare=").append(materialeSuplimentare);
        sb.append(", listaMesajeText=").append(listaMesajeText);
        sb.append('}');
        return sb.toString();
    }
}

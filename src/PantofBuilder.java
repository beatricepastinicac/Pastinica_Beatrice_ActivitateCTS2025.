import enums.ETipMaterial;
import enums.ETipPantof;

public class PantofBuilder implements Builder{
  private Pantof pantof;

    public PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial tipMaterial) {
        this.pantof = new Pantof(tipPantof, nrPantof, dimensiuneToc, tipMaterial);
    }

   public PantofBuilder setMaterialSuplimentar(ETipMaterial materialSuplimentar){
        pantof.addMaterial(materialSuplimentar);
        return  this;
   }

   public PantofBuilder setMesajTextSuplimentar(String mesajeTextSuplimentar){
        pantof.addMesaj(mesajeTextSuplimentar);
        return this;
   }

    @Override
    public Pantof build() throws Exception {
        if(pantof.nrPantof < 35 || pantof.nrPantof>45){
            throw new Exception("Numarul unui pantof trebuie sa fie cuprins in intervalul 35-45\n");
        }

        if(pantof.dimensiuneToc<0.5f||pantof.dimensiuneToc>12.5f){
            throw new Exception("Dimensiunea tocului trebuie sa se incadreze in intervalul 0.5-12.5\n");
        }

        if(pantof.tipPantof == ETipPantof.BALERINI && pantof.materialeSuplimentare.size()>3){
            throw new Exception("Nu se pot da mai multe specificatii suplimentare pentru balerini\n");
        }
        int sumaLungimeMesaje=0;

        for(String mesaj : pantof.listaMesajeText){
            sumaLungimeMesaje+=mesaj.length();
        }
        if(pantof.dimensiuneToc< sumaLungimeMesaje){
            throw new Exception("Mesajul nu poate fi mai mare decat dimensiunea tocului pantofului\n");
        }




        return this.pantof;
    }


}

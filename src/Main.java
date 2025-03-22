import enums.ETipMaterial;
import enums.ETipPantof;

public class Main {
    public static void main(String[] args) throws Exception {
        PantofBuilder pantofBuilder = new PantofBuilder(ETipPantof.GHETE, 38, 11.25f, ETipMaterial.PIELE_ECOLOGICA);
        Pantof pantof = pantofBuilder.build();

      PantofBuilder pantofBuilder1 = new PantofBuilder(ETipPantof.GHETE, 38, 10.25f, ETipMaterial.PIELE_INTOARSA);
//        Pantof pantof1 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PANZA).setMesajTextSuplimentar("Cu floricele").build();

        PantofBuilder pantofBuilder2 = new PantofBuilder(ETipPantof.STILETTO, 38, 11.25f, ETipMaterial.PIELE_ECOLOGICA);
        Pantof pantof2 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PIELE_NATURALA).setMesajTextSuplimentar("bijuterii").build();

        System.out.println(pantof);
       // System.out.println(pantof1);
        System.out.println(pantof2);

    }
}
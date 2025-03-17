package tipuriSingletone;

public class SingletoneStaticBlock {
    private static SingletoneStaticBlock instance;


    private SingletoneStaticBlock(){

    }

    static{ //ajuta la tratarea exceptiilor, interactiune cu bd, fisiere
        System.out.println("Aici este bloc static");
        try{
            instance=new SingletoneStaticBlock();
        }catch (Exception e){
            throw new RuntimeException("Exceptie aparuta la cerere");
        }
    }

    public static SingletoneStaticBlock getInstance(){
        return instance;
    }

}

package prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {


        BookShop bs = new BookShop();
        bs.setShopName("Anticariat");
        bs.loadData();
        // System.out.println(bs);

//        BookShop bs2 = new BookShop();
//        bs2.setShopName("Carturesti");
//        bs2.loadData();
//        System.out.println(bs2);

        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Litera");

        System.out.println(bs);
        System.out.println(bs1);
    }
}

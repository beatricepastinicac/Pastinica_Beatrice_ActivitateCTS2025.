public class ItemMeniu extends ElementMeniu {
    public ItemMeniu(String nume) {
        super(nume);
    }

    @Override
    public void afisare() {
        System.out.println("  - " + nume);
    }
}

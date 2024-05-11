package Decorator.Shop;

public class MaskotkaSklepu implements Produkt {
    Produkt produkt;

    public MaskotkaSklepu(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getCena() {
        return produkt.getCena();
    }

    @Override
    public String getOpis() {
        return produkt.getOpis() + " + Maskotka Sklepu";
    }
}

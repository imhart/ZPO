package Decorator.Shop;

public class KosztTransportu implements Produkt {
    Produkt produkt;

    public KosztTransportu(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getCena() {
        return produkt.getCena() + 13f;
    }

    @Override
    public String getOpis() {
        return produkt.getOpis() + " + Koszt Transportu";
    }
}

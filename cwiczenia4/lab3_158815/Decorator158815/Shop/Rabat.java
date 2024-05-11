package Decorator.Shop;

public class Rabat implements Produkt{
    Produkt produkt;

    public Rabat(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getCena() {
        return produkt.getCena() + -10f;
    }

    @Override
    public String getOpis() {
        return produkt.getOpis() + " + Rabat 10 zl";
    }
}

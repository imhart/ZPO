package Decorator.Shop;

public class SmyczDoPendrive implements Produkt{
    Produkt produkt;

    public SmyczDoPendrive(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getCena() {
        return produkt.getCena() + 1f;
    }

    @Override
    public String getOpis() {
        return produkt.getOpis() + " + Smycz do Pendrive";
    }
}

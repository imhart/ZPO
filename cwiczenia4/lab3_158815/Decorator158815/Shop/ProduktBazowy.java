package Decorator.Shop;

public class ProduktBazowy implements Produkt{
    String opis;

    double cena;

    public ProduktBazowy(String opis, double cena) {
        this.opis = opis;
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

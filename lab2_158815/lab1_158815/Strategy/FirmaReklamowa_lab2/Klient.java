package Strategy.FirmaReklamowa_lab2;

import Strategy.FirmaReklamowa_lab2.Tlumaczenie.JezykStrategia;

public class Klient {

    String imie;

    JezykStrategia preferowanyJezyk;

    Float zaplata;

    public Float getZaplata() {
        return zaplata;
    }

    public Klient(JezykStrategia preferowanyJezyk, Float zaplata, String imie) {
        this.imie = imie;
        this.preferowanyJezyk = preferowanyJezyk;
        this.zaplata = zaplata;
    }

    public String getImie() {
        return imie;
    }

    void przetlumacz(Reklama reklama){
        preferowanyJezyk.przetlumacz(reklama);
    }
}

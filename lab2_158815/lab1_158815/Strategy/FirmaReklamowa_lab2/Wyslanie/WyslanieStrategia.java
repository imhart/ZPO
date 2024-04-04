package Strategy.FirmaReklamowa_lab2.Wyslanie;

import Strategy.FirmaReklamowa_lab2.Klient;
import Strategy.FirmaReklamowa_lab2.Reklama;

public interface WyslanieStrategia {
    void wyslij(Reklama reklama, Klient klient);
}

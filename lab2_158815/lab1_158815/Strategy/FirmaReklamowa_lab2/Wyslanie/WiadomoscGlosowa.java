package Strategy.FirmaReklamowa_lab2.Wyslanie;

import Strategy.FirmaReklamowa_lab2.Klient;
import Strategy.FirmaReklamowa_lab2.Reklama;

public class WiadomoscGlosowa implements WyslanieStrategia{
    @Override
    public void wyslij(Reklama reklama, Klient klient) {
        System.out.println("Wysłano {" + reklama.getText() + "} za pomocą wiadomości głosowej do " + klient.getImie());
    }
}

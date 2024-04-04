package Strategy.FirmaReklamowa_lab2;

import Strategy.FirmaReklamowa_lab2.Wyslanie.List;
import Strategy.FirmaReklamowa_lab2.Wyslanie.Sms;
import Strategy.FirmaReklamowa_lab2.Wyslanie.WiadomoscGlosowa;
import Strategy.FirmaReklamowa_lab2.Wyslanie.WyslanieStrategia;

public class Reklama {

    String text;

    WyslanieStrategia wysylanie;

    public void setWysylanie(Klient klient) {
        if (klient.getZaplata() >= 2f){
            wysylanie = new List();
        } else if (klient.getZaplata() >= 1f && klient.getZaplata() < 2f) {
            wysylanie = new Sms();
        } else {
            this.wysylanie = new WiadomoscGlosowa();
        }

    }

    public Reklama(String text) {
        this.text = text;
    }

    void wyslijDo(Klient klient){
        if( wysylanie == null) setWysylanie(klient);

        wysylanie.wyslij(this, klient);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

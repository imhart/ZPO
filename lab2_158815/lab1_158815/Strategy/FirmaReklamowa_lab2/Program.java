package Strategy.FirmaReklamowa_lab2;

public class Program {
    Reklama reklama;

    Klient klient;

    public Program(Reklama reklama, Klient klient) {
        this.reklama = reklama;
        this.klient = klient;

        this.przetlumacz();
        this.wyslij();
    }

    void przetlumacz(){
        klient.przetlumacz(reklama);
    }

    void wyslij(){
        reklama.wyslijDo(klient);
    }
}

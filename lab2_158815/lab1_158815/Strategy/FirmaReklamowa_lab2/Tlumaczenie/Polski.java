package Strategy.FirmaReklamowa_lab2.Tlumaczenie;

import Strategy.FirmaReklamowa_lab2.Reklama;

public class Polski implements JezykStrategia{
    @Override
    public void przetlumacz(Reklama reklama) {
        reklama.setText(reklama.getText() + " | Po Polsku");
    }
}

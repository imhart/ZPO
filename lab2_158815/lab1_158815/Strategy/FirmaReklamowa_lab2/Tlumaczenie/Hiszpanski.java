package Strategy.FirmaReklamowa_lab2.Tlumaczenie;

import Strategy.FirmaReklamowa_lab2.Reklama;

public class Hiszpanski implements JezykStrategia{
    @Override
    public void przetlumacz(Reklama reklama) {
        reklama.setText(reklama.getText() + " | Po Hiszpańsku");
    }
}

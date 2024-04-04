package Strategy.FirmaReklamowa_lab2;

import Strategy.FirmaReklamowa_lab2.Tlumaczenie.Angielski;
import Strategy.FirmaReklamowa_lab2.Tlumaczenie.Hiszpanski;
import Strategy.FirmaReklamowa_lab2.Tlumaczenie.Polski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<Reklama> reklamy = new ArrayList<>(Arrays.asList(
            new Reklama("Jakaś reklama 1"),
            new Reklama("Jakaś reklama 2"),
            new Reklama("Jakaś reklama 3"),
            new Reklama("Jakaś reklama 4"),
            new Reklama("Jakaś reklama 5")
    ));

    List<Klient> klienci = new ArrayList<>(Arrays.asList(
            new Klient(new Polski(), 1f, "Adam M"),
            new Klient(new Angielski(), 15f, "Henryk S"),
            new Klient(new Hiszpanski(), 0.5f, "Ignacy K"),
            new Klient(new Angielski(), 0.3f, "Jan N"),
            new Klient(new Polski(), 20f, "Jan K")
    ));

    new Program(reklamy.get((int)(Math.random() * reklamy.size())), klienci.get((int)(Math.random() * reklamy.size())));
    }
}

package Decorator.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        List<Produkt> produkty = new ArrayList<>();
        produkty.add(new ProduktBazowy("Książka", 60f));
        produkty.add(new ProduktBazowy("Kubek", 28f));
        produkty.add(new ProduktBazowy("Bluza", 100f));
        produkty.add(new ProduktBazowy("Patelnia", 130f));

        Scanner scanner = new Scanner(System.in);

        int wybor = 0;

        for (int i = 0; i < produkty.size(); i++) {
            System.out.println("Wybierz dodatek:\n1 - Maskotka sklepu (wartość 0 PLN) \n" +
                    "2 - Smycz do pendrive (wartość 1 PLN) \n" +
                    "3 - Rabat w wysokości 10 PLN \n" +
                    "4 - Dodatkowy koszt transportu \n" );
            System.out.print("Wpisz od 1 do 4: ");
            wybor = scanner.nextInt();
            switch (wybor){
                case 1:
                    produkty.set(i, new MaskotkaSklepu(produkty.get(i)));
                    break;
                case 2:
                    produkty.set(i, new SmyczDoPendrive(produkty.get(i)));
                    break;
                case 3:
                    produkty.set(i, new Rabat(produkty.get(i)));
                    break;
                case 4:
                    produkty.set(i, new KosztTransportu(produkty.get(i)));
                    break;
                default: System.out.println(wybor);
            }
        }

        double cena = 0;
        System.out.println("Lista produktow: ");
        for (Produkt produkt:
                produkty) {

            System.out.println(produkt.getOpis() + " - " + produkt.getCena() + "zł");
            cena += produkt.getCena();
        }

        if(cena < 0f){
            cena = 0;
        }
        System.out.println("\nŁączna cena wszystkich produktów: " + cena + "zł");


    }
}

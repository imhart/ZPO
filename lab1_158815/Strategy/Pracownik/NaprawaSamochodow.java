package Strategy.Pracownik;

public class NaprawaSamochodow implements Pracowac{
    @Override
    public void pracuj() {
        System.out.println("Naprawiam samochod");
    }
}

package Strategy.SklepInternetowy;

public class Poland implements TaxStrategy{
    @Override
    public double getTax() {
        return 12;
    }
}

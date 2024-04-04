package Strategy.SklepInternetowy;

public class UK implements TaxStrategy{
    @Override
    public double getTax() {
        return 21;
    }
}

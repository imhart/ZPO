package Strategy.SklepInternetowy;

public class Germany implements TaxStrategy{
    @Override
    public double getTax() {
        return 19;
    }
}

package Strategy.SklepInternetowy;

public class Shop {

    TaxStrategy tax;

    void setTax(TaxStrategy ts){
        tax = ts;
    }

    double getTax(){
        return tax.getTax();
    }
}

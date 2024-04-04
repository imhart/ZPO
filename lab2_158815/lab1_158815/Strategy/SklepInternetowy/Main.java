package Strategy.SklepInternetowy;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setTax(new Poland());
        System.out.println(shop.getTax());

        shop.setTax(new Germany());
        System.out.println(shop.getTax());

        shop.setTax(new UK());
        System.out.println(shop.getTax());
    }
}

package prices;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(!isSignedUpForNewsletter) {
            System.out.println("Przecena prenumeraty: " + price/2);
        } else {
            System.out.println("Użytkownik zapisany do newslettera");
        }
    }
}

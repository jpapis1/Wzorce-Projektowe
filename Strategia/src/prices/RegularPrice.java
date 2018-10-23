package prices;

public class RegularPrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(!isSignedUpForNewsletter) {
            System.out.println("Cena prenumeraty: " + price);
        } else {
            System.out.println("Użytkownik zapisany do newslettera");
        }
    }
}

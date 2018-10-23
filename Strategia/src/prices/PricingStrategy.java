package prices;

public interface PricingStrategy {
    public void calculatePrice(int price, boolean isSignedUpForNewsletter);
}

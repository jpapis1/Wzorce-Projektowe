import java.io.IOException;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed = false;
    private int price;
    private FlightLeg(FlightLegBuilder builder){
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static class FlightLegBuilder {
        String from;
        String to;
        boolean delayed = false;
        int price;
        FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }
        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }
        FlightLeg build() {
            if(this.price==0) {
                throw new IllegalStateException("Brak pola - cena");
            }
            return new FlightLeg(this);
        }
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }
}

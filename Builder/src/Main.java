public class Main {

    public static void main(String[] args) {
	// write your code here
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").price(50).build();

        System.out.println(leg);
    }
}

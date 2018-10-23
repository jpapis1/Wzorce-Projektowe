public class ContinentalFactory implements Factory {
    public Car buildFord(FordModel fordModel) {
        return new Ford(WheelPosition.LEFT,fordModel);
    }
    public Car buildBMW(BMWModel bmwModel) {
        return new BMW(WheelPosition.LEFT,bmwModel);
    }
}

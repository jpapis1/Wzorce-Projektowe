public class CommonwealthFactory implements Factory{
    public Car buildFord(FordModel fordModel) {
        return new Ford(WheelPosition.RIGHT,fordModel);
    }
    public Car buildBMW(BMWModel bmwModel) {
        return new BMW(WheelPosition.RIGHT,bmwModel);
    }
}

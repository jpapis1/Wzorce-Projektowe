public class MyWeek extends WeekDay {

    protected int goToWork(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR:
                return 15;
            case BIKE:
                return 50;
            case TRAIN:
                return 20;
            default:
                return 100;
        }
    }

    protected void work() {
        System.out.println("Praca w kawiarni");
    }
}

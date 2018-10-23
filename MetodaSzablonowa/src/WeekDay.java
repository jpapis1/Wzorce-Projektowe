public abstract class WeekDay {
    public final void everyDayIsExaclyTheSame(TypeOfTransport typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void wakeUp() {
        System.out.println("Pobudka.");
    }

    private void getReady() {
        System.out.println("Przygotowanie do wyjścia.");
    }

    protected abstract int goToWork(TypeOfTransport typeOfTransport);

    private void summary(int time) {
        System.out.println("Trasa zajęła " + time + " minut.");
    }

    protected abstract void work();

    private void goHome() {
        System.out.println("Powrót do domu.");
    }

}

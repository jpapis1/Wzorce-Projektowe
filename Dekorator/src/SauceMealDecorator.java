public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    void prepareMeal() {
        this.meal.prepareMeal();
        addSauce();
    }
    void addSauce() {
        System.out.println("Dodaję sos.");
    }
}

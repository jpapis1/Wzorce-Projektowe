public class ChickenMealDecorator extends MealDecorator{
    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    void prepareMeal() {
        this.meal.prepareMeal();
        addChicken();
    }
    void addChicken() {
        System.out.println("Dodaję kurczaka.");
    }
}

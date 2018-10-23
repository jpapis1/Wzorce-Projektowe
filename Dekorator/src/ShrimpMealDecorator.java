public class ShrimpMealDecorator extends MealDecorator {
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    void prepareMeal() {
        this.meal.prepareMeal();
        addShrimp();
    }
    void addShrimp() {
        System.out.println("Dodaję krewetkę.");
    }
}

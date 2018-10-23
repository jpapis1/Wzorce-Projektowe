public abstract class MealDecorator extends Meal {
    Meal meal;


    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    void prepareMeal() {
        this.meal.prepareMeal();
    }
}

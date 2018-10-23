public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Nowy posiłek:");
        Meal meal = new RiceMeal();
        meal.prepareMeal();
        System.out.println("Nowy posiłek:");
        meal = new SauceMealDecorator(new RiceMeal());
        meal.prepareMeal();
        System.out.println("Nowy posiłek:");
        meal = new ShrimpMealDecorator(new PotatoMeal());
        meal.prepareMeal();
    }
}

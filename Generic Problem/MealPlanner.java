interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}
class HighProteinMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    private String name;
    private T plan;

    public Meal(String name, T plan) {
        this.name = name;
        this.plan = plan;
    }

    public String getName() {
        return name;
    }

    public T getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "Meal{name='" + name + "', plan=" + plan.getClass().getSimpleName() + "}";
    }
}

class MealPlanner {
    public static <T extends MealPlan> Meal<T> generateMealPlan(String name, T plan) {
        return new Meal<>(name, plan);
    }
}

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> breakfast = MealPlanner.generateMealPlan("Breakfast", new VegetarianMeal());
        Meal<VeganMeal> lunch = MealPlanner.generateMealPlan("Lunch", new VeganMeal());
        Meal<KetoMeal> dinner = MealPlanner.generateMealPlan("Dinner", new KetoMeal());

        System.out.println(breakfast);
        System.out.println(lunch);
        System.out.println(dinner);
    }
}

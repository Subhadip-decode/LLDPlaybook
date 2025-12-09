import base.BasePizza;
import base.CheeseDelightPizza;
import base.FarmHousePizza;
import decorators.ExtraCheeseToppings;
import decorators.MushroomToppings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BasePizza pizza = new FarmHousePizza();
        System.out.println(pizza.name()+" at "+pizza.cost());
        BasePizza pizza1 = new MushroomToppings(new ExtraCheeseToppings(new CheeseDelightPizza()));
        System.out.println(pizza1.name()+" at "+pizza1.cost());
    }
}
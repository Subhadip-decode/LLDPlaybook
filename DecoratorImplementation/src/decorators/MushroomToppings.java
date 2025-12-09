package decorators;

import base.BasePizza;

public class MushroomToppings extends Toppings{
    private BasePizza pizza;

    public MushroomToppings(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+20;
    }

    @Override
    public String name() {
        return pizza.name()+" and with extra mushrooms";
    }
}

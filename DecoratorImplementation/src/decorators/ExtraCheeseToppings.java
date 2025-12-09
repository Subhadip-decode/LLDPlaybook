package decorators;

import base.BasePizza;

public class ExtraCheeseToppings extends Toppings{
    private BasePizza pizza;

    public ExtraCheeseToppings(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+10;
    }

    @Override
    public String name() {
        return pizza.name()+ " and with extra chesse";
    }
}

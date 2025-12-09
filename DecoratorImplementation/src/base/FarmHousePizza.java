package base;

public class FarmHousePizza extends BasePizza{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String name() {
        return "Farmhouse pizza";
    }
}

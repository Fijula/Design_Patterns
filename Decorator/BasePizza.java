package Design_Patterns.Decorator;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base Pizza";
    }
}
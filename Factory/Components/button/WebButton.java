package Factory.Components.button;

public class WebButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("change the button in web");
    }
}
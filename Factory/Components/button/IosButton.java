package Factory.Components.button;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("change the size in IOS");
    }
}
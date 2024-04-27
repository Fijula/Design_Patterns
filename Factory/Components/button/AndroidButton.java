package Factory.Components.button;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("change the size in Android");
    }
}

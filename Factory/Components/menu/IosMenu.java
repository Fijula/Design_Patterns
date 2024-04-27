package Factory.Components.menu;
public class IosMenu implements Menu{
    @Override
    public void getMenuList() {
        System.out.println("get the menu list in ios");
    }
}
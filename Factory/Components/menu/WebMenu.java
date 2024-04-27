package Factory.Components.menu;
public class WebMenu implements Menu{
    @Override
    public void getMenuList() {
        System.out.println("get the list of menu in web");
    }
}

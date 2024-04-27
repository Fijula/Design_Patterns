package Factory;
import Factory.Components.button.Button;
import Factory.Components.menu.Menu;
public class Client {
    public static void main(String[] args) {
        ReactNative reactNative = new ReactNative(SupportedPlatforms.WEB);
        UIFactory uiFactory = reactNative.getUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize();
        Menu menu = uiFactory.createMenu();
        menu.getMenuList();
      
    }
}
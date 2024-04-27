package Factory;

import Factory.Components.button.AndroidButton;
import Factory.Components.button.Button;
import Factory.Components.menu.AndroidMenu;
import Factory.Components.menu.Menu;

public class AndroidUiFactory  implements UIFactory{
     @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

   
}

package Factory;

import Factory.Components.button.Button;
import Factory.Components.button.WebButton;
import Factory.Components.menu.Menu;
import Factory.Components.menu.WebMenu;

public class WebUiFactory  implements UIFactory{
     @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Menu createMenu() {
        return new WebMenu();
    }

}

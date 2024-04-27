package Factory;

import Factory.Components.button.Button;
import Factory.Components.button.IosButton;
import Factory.Components.menu.IosMenu;
import Factory.Components.menu.Menu;

public class IosUiFactory implements UIFactory{
        @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }


}

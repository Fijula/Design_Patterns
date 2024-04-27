package Factory;

import Factory.Components.button.Button;
import Factory.Components.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
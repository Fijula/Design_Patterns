Objective: Create UI components (buttons and menus) for different platforms (web, iOS, Android) using the Factory/ Abstract Factory pattern.

Components:

UIFactory/AbstractUIFactory (Interface): Defines methods for creating Button and Menu objects (abstract part of the Factory pattern).
Concrete Factories (IosUiFactory, WebUiFactory): Implement AbstractUIFactory and create platform-specific UI components (IosButton, WebButton, etc.).
UiFactoryFactory: Centralizes logic for creating the appropriate AbstractUIFactory based on the platform (key part of the Factory pattern with a platform twist).
Button, Menu (Interfaces): Define methods for UI component functionalities (abstract part of the Factory pattern).
Platform-Specific UI Components (IosButton, WebButton): Implement Button and Menu for specific platforms.

Flow:

Client:
Creates a ReactNative object (platform information might be stored here).
UiFactoryFactory:
Takes the platform information from ReactNative.
Uses a switch statement to return the appropriate concrete AbstractUIFactory implementation (e.g., IosUiFactory for iOS).
Client:
Receives the AbstractUIFactory object from UiFactoryFactory.
Client:
Calls createButton() and createMenu() methods on the AbstractUIFactory to create platform-specific buttons and menus.
Interacts with these buttons and menus using the generic interface methods (e.g., button.changeSize()).

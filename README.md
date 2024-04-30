Abstract Class (OperatingSystem):

Defines the common structure and properties (version, architecture) for all operating systems.
Declares abstract methods for functionalities specific to each OS (changeDir, removeDir) that concrete classes must implement.
Concrete Classes (WindowsOperatingSysten, LinuxOperatingSystem):

Extend OperatingSystem and provide implementations for the abstract methods (changeDir, removeDir) tailored to their respective OS commands.
Contain constructors to initialize version and architecture details.
Factory Class (OperatingSystemFactory):

A static method getInstance() takes OS type, version, and architecture as arguments.
Uses a switch statement to decide which concrete OS class to instantiate based on the provided type.
Returns the appropriate OperatingSystem object (WindowsOperatingSysten or LinuxOperatingSystem) initialized with the given version and architecture.

Clients (code that needs OS objects) don't directly create concrete OS instances. They interact with the OperatingSystemFactory.
The factory encapsulates the logic of deciding which OS class to create based on the requested type.
This promotes loose coupling, as clients only need to know about the OperatingSystem interface and the factory to get the desired OS object.
New OS types can be easily added by creating a new concrete class extending OperatingSystem and updating the factory's creation logic.
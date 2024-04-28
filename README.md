The Facade design pattern is a structural design pattern that provides a simplified interface to a complex system, making it easier to use. It encapsulates the complexity of the system behind a single class, known as the facade, that exposes a simple and unified interface to the client.

movie theater system:
The theater system consists of multiple subsystems such as the ticket booking system, the snack bar, and the movie playback system. Each subsystem has its own set of classes and methods.

When the client code calls movieTheaterFacade.watchMovie(), it doesn’t need to know about the internal workings of the subsystems. The facade takes care of coordinating the actions of the subsystems, such as booking tickets, ordering snacks, and playing the movie.It hides the complexity and details of the subsystems, promoting a more straightforward and intuitive usage.

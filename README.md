In Depth of Design Patterns :
What are Design patterns :design patterns are reusable solutions to common software design problems. 
 1.Creational Design Patterns :
a) Singleton - Single instance of a class and provides a global access point to it - Loggin, Session, Cache, Drivers
           how to implement? Constructor private, public method to return Instance,  make instance type static
           types of implementation?lazy,eager,thread safe- syncronzed method,thread safe- synchronized block (double check/double locking mechanizm) ,Bill pugh and Enums
           Use Case- File based configuration manager, Logger, Connection loop 
           Pros-Guarantees a Single Instance,Controlled Access,Resource Efficiency:
           ConsTight Coupling,Threading Issues ,Lack of Flexibility

           
b) Builder - construct complex objects step-by-step in a controlled and flexible manner. It separates the object construction process from its representation.
           Use Case -database configuration class,Building Queries, Messaging services
           Implementation?create a Builder object, methods on the Builder to set the desired properties of the product, call a build() method on the Builder to create the final product object.
           Pros - -Readability, Error Reduction,Flexibility
           Cons-Boilerplate Code (Potential): Introducing a builder can add extra classes and methods for simple objects.

           
c)Prototype-Registry - centralized location to store and manage reusable prototype objects.
           Use Case Configuration Object Cloning-
           Implementation-Configuration Object Cloning,Efficient Invoice Generation, Object cloning for Social App users
           Pros-Improved performance by reusing existing objects as prototypes,Reduced code duplication and Centralized management
           Cons-Deep cloning can be complex for objects with intricate structures,Requires careful management of the registry to avoid memory leaks

d)Factory - bject creation interface, letting subclasses decide which class to instantiate.
           Use Case -notification system (Depending on the type of notification (e.g., email, SMS, push notification), Audio Player(r application that supports different audio formats, such as MP3, WAV, and FLAC. Each audio format requires a specific decoder and player implementation),Document Processing(type of document (e.g., text, spreadsheet, presentation)
           Pros-Decoupling,Code Reusability: 
           Cons-Increased Complexity,Tight Coupling Between Factories,Overkill for Simple Cases
           Difference between Factory and Abstract Factory -> main differences between them is the level of abstraction. The Factory pattern deals with creating objects of a single type, while the Abstract Factory pattern deals with creating objects of related types. The Factory pattern is simpler and more flexible, but the Abstract Factory pattern is more robust and consistent. Another difference is the number of classes involved. The Factory pattern usually has one Factory class and one interface for the products, while the Abstract Factory pattern has one Abstract Factory interface, multiple concrete Factory classes, and multiple interfaces for the products. The Factory pattern is easier to implement and maintain, but the Abstract Factory pattern is more scalable and extensible.

2. Structural Design Pattern :
   a) Adapter Design Pattern : allows objects with incompatible interfaces to collaborate. It acts as a bridge between two incompatible interfaces, enabling them to work together seamlessly.
              Use Case-Social Media Aggregator(create adapter classes for different social media platform APIs,conform to a common interface,easy to integrate new platforms in the future.Adapter Pattern for Language Translation(integrate with different translation services like Google Translate, Microsoft Translator, and Yandex)
              Pros-Decoupling,Improved Maintainability,Flexibility(introduce new adapters for different types ),Reusability( incompatible objects to work together)
              Cons - Increased Complexity,Performance Overhead
 b) Facade - Hide the complex Implementation(System Complexities) from the Client
             Use Case- Image Editing(offers various features like loading images, applying filters, adjusting brightness, and saving images. The editing module has complex interactions and dependencies. Your goal is to simplify the interface for users by providing a unified way to access and control these editing functionalities),Data Analysis(The application involves data collection, preprocessing, analysis algorithms, and visualization. The interactions between these components can become complex),Travel Booking App( needs to handle bookings, payments, and notifications through different external services. The goal is to provide a simplified interface for customers and internal modules to perform booking-related tasks without directly dealing with the intricacies of each external service.)
            Pros-
            Cons-

   Adapter Pattern:
Adapter and Facade Differnce
Adapter:
Adapter Pattern:
Focus: Bridges compatibility gaps between incompatible interfaces.
Goal: Enables objects with different interfaces to work together seamlessly.
Structure:
Interfaces define expected functionalities for each system.
Concrete classes implement the interfaces for specific objects.
An adapter class implements the target interface and translates requests to the source system's compatible actions.
Example:the Iphone4sTo6sAdapter lets the iPhone 6s (with IPhone interface) use a 4s charger (with a different charging mechanism represented by Iphone4sCharger).

Facade Pattern:
Focus: Simplifies a complex interface by providing a simpler, unified interface.
Goal: Makes a large system or library easier to use by hiding its internal complexity.
Structure:
A facade class acts as a single point of entry, encapsulating interactions with multiple underlying objects or subsystems.
The facade class might delegate tasks to different internal components but expose a simpler API for the client code.
Example: Imagine a library with numerous functions for image manipulation. A facade could provide a few high-level functions like "resize" or "apply filter," simplifying the interaction for users who don't need to know the low-level details.

c)Decorator Design Pattern

d) Flyweight :Define a Flyweight interface that specifies the methods for managing and using flyweight objects.Implement a Flyweight Factory that creates and manages a pool of flyweight objects. It ensures efficient sharing and avoids creating duplicates.
Concrete Flyweight classes implement the Flyweight interface and store the intrinsic state (unchanging data) of the object.
Client code uses the Flyweight Factory to obtain flyweight objects. It then sets the extrinsic state (changeable data) as needed.
 Use Case-Chess User Optimization (Each user object consumes memory, and you want to optimize the memory usage by only keeping one copy of fields that do not change.). One user can play multiple games simultaneously. At the moment, you create a new user object for each game,...graphical editing software.(The application must support rendering text with different fonts, sizes, and colors. The application must also support rendering images with different dimensions and formats. Joe is concerned about the memory overhead of creating multiple text and image objects with the same state.)
 Pros-Reduced memory usage by sharing objects.Improved performance by avoiding redundant object creation.Easier to manage object state as intrinsic state is centralized in flyweight objects.
 Cons-Increased complexity compared to simpler object creation.Requires careful consideration of which data is intrinsic and can be shared.Might not be suitable for objects with complex or frequently changing extrinsic state.


 
3)BEHAVIUORAL DESIGN PATTERN

a) Stratergy Design pattern :allows you to dynamically change the behavior of an object at runtimeIt's like having different tools in your toolbox and choosing the right one for the job at hand.
 Use case : Stock Trading Indicators(application currently calculates various trading indicators such as moving averages, momentum, and volatility. These indicators are used to make decisions about buying, selling, or holding stocks),Refactoring Pricing Calculation(pricing calculator for a ride-sharing app. The existing pricing manager class (PricingManager) uses a monolithic approach to calculate ride prices based on different strategies: distance-based, time-based, and surge pricing. The goal is to refactor the code to use the Strategy pattern, allowing for more flexible pricing strategies and better maintenance.),Video Streaming Quality Adjustment(video streaming platform that offers different streaming qualities, such as low, standard, and high definition. The platform should dynamically adjust the streaming quality based on the user's network conditions to ensure smooth playback. Additionally, more quality adjustment algorithms may be added in the future)
 Pros-Open/Closed Principle: ,Reusability,Flexibility: You can easily add new algorithms (strategies) without modifying existing code.Maintainability: The core logic of each algorithm is encapsulated within a separate class, making the code easier to understand, test, and maintain. 
 Cons- Increased Complexity: Introducing interfaces, concrete strategies, and a context class can increase the overall complexity of the codebase, especially for simpler scenarios and Performance Overhead

 b)State: object to alter its behavior when its internal state changes. It essentially creates separate objects to represent different states of an object, promoting cleaner and more manageable code.
  Use Case:
  a)Traffic Light:States: RedState, YellowState, GreenState.Behavior: Each state object controls the light duration and Context: The traffic light object manages state transitions nd delegates light control to the current state object.
  b)Vending Machine:States: HasMoneyState, NoMoneyState, SoldoutState.Behavior: Each state object handles user interactions (e.g., insert money, select product, return money) based on the current state (has money, no money, out of stock).Context: The vending machine object manages state transitions (e.g., insert money -> HasMoneyState) and delegates actions to the current state object.
c)Game Character:States: RunningState, JumpingState, AttackingState.Behavior: Each state object handles character movement and actions (e.g., move left/right, jump, attack) according to the current state (running, jumping, attacking).Context: The game character object manages state transitions (e.g., jump button pressed -> JumpingState) and delegates actions to the current state object.


  Pros:Clearer State Management:,Improved Maintainability,Flexiblity
  cons:Increased Complexity,State Explosion: ,Overuse

 * Differnce between State and Strategy Design Pattern :
 * State Design Pattern-Focus - Internal state of the object , Encapsulate behavior based on different states,State objects, context object holds reference to state,ex:Light switch with On/Off states
 * Strategy -Focus External criteria (not necessarily internal state),Dynamically change algorithm based on chosen strategy,Interface, concrete strategies, context holds reference to strategy,ex :Sorting by name, attack power, etc.
 

 * Difference between Stratergy and Decorator :
 -> Stratergy : Focus: Dynamically changing the behavior of an algorithm at runtime.
Goal: Allows you to choose and swap between different implementations of an algorithm based on specific criteria.
 -> Decorator- Focus: Adding or modifying the behavior of an object at runtime in a layered fashion.Goal: Extend the functionality of an object without changing its core structure or subclassing it.

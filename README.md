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

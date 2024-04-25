In Depth of Design Patterns :
What are Design patterns :design patterns are reusable solutions to common software design problems. 
Creational Design Patterns :
a) Singleton - Single instance of a class and provides a global access point to it - Loggin, Session, Cache, Drivers
           how to implement? Constructor private, public method to return Instance,  make instance type static
           types of implementation?lazy,eager,thread safe- syncronzed method,thread safe- synchronized block (double check/double locking mechanizm) ,Bill pugh and Enums
           Use Case- File based configuration manager, Logger, Connection loop 
           Pros-Guarantees a Single Instance,Controlled Access,Resource Efficiency:
           ConsTight Coupling,Threading Issues ,Lack of Flexibility
b) Builder - construct complex objects step-by-step in a controlled and flexible manner. It separates the object construction process from its representation.
           Use Case -database configuration class,Building Queries, Messaging services
           Implementation?create a Builder object,l methods on the Builder to set the desired properties of the product, call a build() method on the Builder to create the final product object.
           Pros - -Readability, Error Reduction,Flexibility
           Cons-Boilerplate Code (Potential): Introducing a builder can add extra classes and methods for simple objects.

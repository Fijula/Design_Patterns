In Depth of Design Patterns :
What are Design patterns :design patterns are reusable solutions to common software design problems. 
Creational Design Patterns :
a) Singleton - Single instance of a class and provides a global access point to it - Loggin, Session, Cache, Drivers
           how to implement? Constructor private, public method to return Instance,  make instance type static
           types of implementation?
                      1)lazy
                      2)eager
                      3)thread safe- syncronzed method
                      4)thread safe- synchronized block (double check mechanizm) 
                      5)Bill pugh - static inner helper class to create the instance.(thread safe no need to make snchronized)
                      6)Enums-special type in Java that combine the features of enumerated types (constants) and user-defined classes.
                                 When you declare an enum, the Java compiler automatically creates a single instance for each enum constant you define.
           Use Case- 
                      1)File based configuration manager -single instance of a file-based configuration manager in LE (Logic Engine) applications, preventing                                inconsistencies and resource conflicts. This single instance manages configuration settings by loading them from a file, storing them in                              memory, and providing methods to get, set, and remove individual settings.
                      2) Logger -Singleton Logger ensures a single instance writes log messages (timestamp, level, message) to a single log file for an application.
                      3)Connection loop - Singleton Connection Pool manages a single instance that provides a pool of database connections for efficient sharing and                         resource usage within an application.
                      
           

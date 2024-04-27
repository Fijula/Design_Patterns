Prototype-Registry - centralized location to store and manage reusable prototype objects.
Steps to Implemnt :
1. Prototype Interface:
Define an interface (Prototype in  code) that declares a clone method. This method throws a CloneNotSupportedException as objects may not inherently support cloning.

2. Concrete Prototype Classes:
Implement concrete classes (e.g., Student and IntelligentStudent in code) that extend the Prototype interface.
In these classes, override the clone method to handle deep/shallow copying of their member variables.
Optionally, implement the Cloneable interface in concrete classes to explicitly indicate they support cloning.

3. Prototype Registry:
Create a Registry class that acts as the central storage for prototypes.
The registry should have methods for:
Registering a prototype with a unique key (e.g., "Batches" for Student data).
Retrieving a clone of a prototype object by its key.

4. Client Usage:
Create an instance of the registry.
Register prototype objects with the registry using their key.
To create a new object, retrieve a clone of the desired prototype from the registry using its key.
Modify the cloned object as needed to create a new instance with customized data.

Use Case
Implementation-
a)Configuration Object Cloning-Define a Configurable interface with a clone method for deep copying.
  Implement a ConfigurationPrototypeRegistry to manage prototype configurations and provide methods for adding, retrieving, and cloning them. This avoids repetitive configuration setup and reduces errors.
b)Efficient Invoice Generation-Define an ObjectClonable interface with a clone method for deep copying invoices. Implement an InvoicePrototypeRegistry to manage prototype invoices and provide methods for adding, retrieving, and cloning them. 
This avoids database calls and speeds up test invoice generation.
c)Object Cloning in Testing- you to create prototype objects and clone them when needed, avoiding the overhead of setting up complex user objects repeatedly - Social media App


2 ways of cloning:
Shallow Cloning:
Creates a new object of the same type as the original object and Copies the references (memory addresses) to the original object's fields, not the actual values of those fields.
Any changes made to the cloned object's fields will also affect the original object's fields because they both refer to the same underlying data.

Deep Cloning:
Creates a new object of the same type as the original object and Copies the actual values of the original object's fields into the corresponding fields of the new object.
Changes made to the cloned object's fields do not affect the original object's fields because they hold independent copies of the data.

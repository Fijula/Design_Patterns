Flyweight is a Structural Design Pattern when we need to create a lot of Objects of a class.
Reduce memeory by sharing objects

e Object property into intrinsic and extrinsic properties. Intrinsic properties make the Object unique whereas extrinsic properties are set by client code and used to perform different operations

create a Flyweight factory that returns the shared objects.

. So we will have an interface Shape and its concrete implementations as Line and Oval. Oval class will have intrinsic property to determine whether to fill the Oval with given color or not whereas Line will not have any intrinsic property.


The flyweight factory will be used by client programs to instantiate the Object, so we need to keep a map of Objects in the factory that should not be accessible by client application. Whenever client program makes a call to get an instance of Object, it should be returned from the HashMap, if not found then create a new Object and put in the Map and then return it. We need to make sure that all the intrinsic properties are considered while creating the Object.


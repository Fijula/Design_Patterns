Iphone6 to use Iphone 4s Charger:
Define Interfaces: Charger (Charge method) and Iphone(OnCharge())

 Implement Concrete Classes:Iphone4sCharger,IPhone6s
 
 Introduce the Adapter:Iphone4sTo6sAdapter-It implements the Charger interface, making it compatible with the IPhone6s that expects a Charger object.
Inside the adapter, it holds a reference to an Iphone4sCharger object, representing the actual charger you're using.

Adapter's Functionality:
When the IPhone6s.OnCharge() method is called:
The IPhone6s object doesn't know how to charge itself directly. It relies on the injected Charger dependency (which is actually the adapter in this case).
The IPhone6s calls the charge() method on the adapter (Iphone4sTo6sAdapter).
Since the adapter implements Charger, the IPhone6s doesn't see any difference.
Inside the adapter's charge() method, it delegates the call to the Iphone4sCharger instance it holds. This translates the IPhone6s request to a compatible action for the 4s charger.

Source System's Action:

The Iphone4sCharger object's charge() method is finally invoked, performing the actual charging logic specific to the 4s charger.

NOTE:
The IPhone6s doesn't need to know the specifics of the charger (4s) because it interacts through the adapter.
The adapter acts as a bridge, translating the IPhone6s request into a compatible action for the Iphone4sCharger.
This allows the IPhone6s to work with the Iphone4sCharger even though they wouldn't be directly compatible.


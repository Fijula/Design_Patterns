package Design_Patterns.Adapter;

public class Iphone4sCharger implements Charger
{
    Iphone4sCharger(){};

    public void charge()
    {
        System.out.println("charging with 4s charger");
    }
}
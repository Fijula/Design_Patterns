package Design_Patterns.Adapter;

public class Main
{
    public static void main(String args[])
    {
        IPhone6s iphone6s = new IPhone6s(new Iphone4sTo6sAdapter());
        iphone6s.OnCharge();
      
    }
}
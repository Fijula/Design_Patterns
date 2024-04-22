package Design_Patterns;
//Eager Initiazation
class SingletonEagar {
    private static SingletonEagar instance = new SingletonEagar(); 
    
    private SingletonEagar(){}
    
    public static SingletonEagar getInstance() {
      return instance;
    }
  }
  
  //Lazy Initiazation
  class SingletonLazy {
    private static SingletonLazy instance; 
    
    private SingletonLazy(){}
    
    public static SingletonLazy getInstance() {
      if(instance == null) {
        instance = new SingletonLazy();
      }
      
      return instance;
    }
  }
  //Synchronized Methods
  class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance; 
    
    private SingletonSynchronizedMethod(){}
    
    public static synchronized SingletonSynchronizedMethod getInstance() {
      if(instance == null) {
        instance = new SingletonSynchronizedMethod();
      }
      return instance;
    }
  }
  
  //Synchronized Blocks
  class SingletonSynchronized {
    private static SingletonSynchronized instance; 
    
    private SingletonSynchronized(){}
    
    public static SingletonSynchronized getInstance() {
      if(instance == null) {
        synchronized (SingletonSynchronized.class) {
          if(instance == null) {
            instance = new SingletonSynchronized();
          }
        }
      }
      return instance;
    }
  }
  
  public class Singleton {
  
    public static void main(String[] args) {
      SingletonSynchronized instance = SingletonSynchronized.getInstance();
      
      System.out.println(instance);
      
      SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
      
      System.out.println(instance1);
    }
  }

  // Output will be same for both Instance:
  // Design_Patterns.SingletonSynchronized@2f92e0f4
  // Design_Patterns.SingletonSynchronized@2f92e0f4
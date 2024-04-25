// package Design_Patterns;

//Eager Initiazation
class SingletonEagar {
  private static SingletonEagar instance = new SingletonEagar();

  private SingletonEagar() {
  }

  public static SingletonEagar getInstance() {
    return instance;
  }
}

// Lazy Initiazation
class SingletonLazy {
  private static SingletonLazy instance;

  private SingletonLazy() {
  }

  public static SingletonLazy getInstance() {
    if (instance == null) {
      instance = new SingletonLazy();
    }

    return instance;
  }
}

// Synchronized Methods
class SingletonSynchronizedMethod {
  private static SingletonSynchronizedMethod instance;

  private SingletonSynchronizedMethod() {
  }

  public static synchronized SingletonSynchronizedMethod getInstance() {
    if (instance == null) {
      instance = new SingletonSynchronizedMethod();
    }
    return instance;
  }
}

// Synchronized Blocks
class SingletonSynchronized {
  private static SingletonSynchronized instance;

  private SingletonSynchronized() {
  }

  public static SingletonSynchronized getInstance() {
    if (instance == null) {
      synchronized (SingletonSynchronized.class) {
        if (instance == null) {
          instance = new SingletonSynchronized();
        }
      }
    }
    return instance;
  }
}

// Bill Pugh's Singleton Implementation
class SingletonBillPugh {
  private SingletonBillPugh() {
  }

  private static class SingletonHelper {
    private static final SingletonBillPugh instance = new SingletonBillPugh();
  }

  public static SingletonBillPugh getInstance() {
    return SingletonHelper.instance;
  }
}

// Enum based Singleton
enum SingletonEnum {
  INSTANCE;

  public void enumMethod() {
    System.out.println("This method is called from the Singleton instance");
  }
}

public class Singleton {

  public static void main(String[] args) {
    SingletonSynchronized instance = SingletonSynchronized.getInstance();

    System.out.println(instance);

    SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

    System.out.println(instance1);

    // Bill Pugh's Singleton
    SingletonBillPugh instance2 = SingletonBillPugh.getInstance();
    System.out.println(instance2);

    // Enum based Singleton
    SingletonEnum instance3 = SingletonEnum.INSTANCE;
    instance3.enumMethod(); // Call methods from the enum

  }
}

// Output :
// SingletonSynchronized@2f92e0f4
// SingletonSynchronized@2f92e0f4
// SingletonBillPugh@1f32e575
// This method is called from the Singleton instance

package PrototypeRegistry.ShallowCloning;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Prototype> students;

    public Registry() {
        students = new HashMap<>();
    }

    public void register(String key, Prototype student) {
        students.put(key, student);
    }

    public Prototype get(String key) throws CloneNotSupportedException {
        return students.get(key).clone(); // Shallow copy
    }
}

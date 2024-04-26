package PrototypeRegistry.ShallowCloning;

public interface Prototype {
    Prototype clone() throws CloneNotSupportedException;
}
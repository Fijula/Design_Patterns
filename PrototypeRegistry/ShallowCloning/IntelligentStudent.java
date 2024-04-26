package PrototypeRegistry.ShallowCloning;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

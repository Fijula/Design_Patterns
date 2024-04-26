package PrototypeRegistry.DeepCloning;

import java.util.HashMap;
import java.util.Map;

public class IntelligentStudent extends Student implements Cloneable {
    private int iq;
    private Map<String, String> additionalInfo; // Example of a complex field

    public IntelligentStudent() {
        additionalInfo = new HashMap<>();
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = new HashMap<>(additionalInfo); // Deep copy for complex field
    }

    @Override
    public IntelligentStudent clone() throws CloneNotSupportedException {
        // IntelligentStudent clone = (IntelligentStudent) super.clone();
        // clone.setAdditionalInfo(new HashMap<>(this.additionalInfo)); // Deep copy for complex field
        // return clone;
        // return this;
        IntelligentStudent clone = new IntelligentStudent();  // Create a new Student object
        // clone.setBatchName(this.batchName);  // Copy batchName value
        // clone.setAvgBatchPsp(this.avgBatchPsp);  // Copy avgBatchPsp value
        clone.setAdditionalInfo(new HashMap<>(this.additionalInfo));
        return clone;
    }
}
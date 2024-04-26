package PrototypeRegistry.DeepCloning;

public class Student implements Prototype {
    private String batchName;
    private String avgBatchPsp;

    public Student() {
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(String avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    // @Override
    // public Prototype clone() throws CloneNotSupportedException {
    // return this;
    // }
    
    @Override
public Student clone() throws CloneNotSupportedException {
    Student clone = new Student();  // Create a new Student object
    clone.setBatchName(this.batchName);  // Copy batchName value
    clone.setAvgBatchPsp(this.avgBatchPsp);  // Copy avgBatchPsp value
    return clone;
}

    @Override
    public String toString() {
        return "Batch Name : " + batchName + " ,  avg batch psp : " + avgBatchPsp;
    }
}



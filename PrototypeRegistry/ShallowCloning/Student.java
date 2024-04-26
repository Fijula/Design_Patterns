package PrototypeRegistry.ShallowCloning;

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

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        // return (Prototype) this.clone(); // Throwing Infinite Stack Overflow
        return this;
        //  return super.clone(); // Eror:Type mismatch: cannot convert from Object to Prototype
    }

    @Override
    public String toString(){
        return "Batch Name : "+batchName+" ,  avg batch psp : "+avgBatchPsp ;
    }
}

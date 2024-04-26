package PrototypeRegistry.DeepCloning;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Registry sr = new Registry(); // Create registry
        fillRegistry(sr);

        // Clone Student object for Beginner Batch
        Student st1 = (Student) sr.get("Batches").clone(); 
        st1.setBatchName("Beginner Batch");
        st1.setAvgBatchPsp("40");

        // Clone IntelligentStudent object for Advanced Batch
        IntelligentStudent st2 = (IntelligentStudent) sr.get("IntelligentBatch").clone(); 
        st2.setBatchName("Advanced Batch");
        st2.setAvgBatchPsp("98");

        IntelligentStudent st4 = (IntelligentStudent) sr.get("IntelligentBatch").clone(); 
        st4.setBatchName("Super Batch");
        st4.setAvgBatchPsp("99.999");
        // Print the cloned objects
        System.out.println("Student 1 (Beginner Batch):");
        System.out.println(st1);


        System.out.println(" Super Intelligent Batch (Deep cloned from Advanced Batch):");
        System.out.println(st4);
        
        System.out.println("Intelligent Batch (Advanced Batch) :");
        System.out.println(st2);
        // Print the original objects from the registry
        System.out.println("Original Batches in Registry:");
        Student originalBatch = (Student) sr.get("Batches");
        if (originalBatch != null) {
            System.out.println(originalBatch);
        }
    }

    public static void fillRegistry(Registry sr) {
        Student batchInfo = new Student();
        batchInfo.setBatchName("0 "); // Initial name before cloning
        batchInfo.setAvgBatchPsp("0"); // Initial PSP before cloning

        // Register the object with key "Batches" for Student data
        sr.register("Batches", batchInfo);

        // Create IntelligentStudent object for Advanced Batch
        IntelligentStudent advancedBatch = new IntelligentStudent();
        advancedBatch.setIq(187);
        advancedBatch.setBatchName("Advanced Batch");
        advancedBatch.setAvgBatchPsp("98");
        Map<String, String> info = new HashMap<>();
        info.put("Skill", "Problem Solving");
        advancedBatch.setAdditionalInfo(info); //
        // Register the object with key "IntelligentBatch" for IntelligentStudent data
        sr.register("IntelligentBatch", advancedBatch);
    }
}



//Output:
// Student 1 (Beginner Batch):
// Batch Name : Beginner Batch ,  avg batch psp : 40
//  Next Intelligent Batch (Advanced Batch):
// Batch Name : Aaaaa Batch ,  avg batch psp : 99
// Intelligent Batch (Advanced Batch):
// Batch Name : Advanced Batch ,  avg batch psp : 98
// Original Batches in Registry:
// Batch Name : 0  ,  avg batch psp : 0
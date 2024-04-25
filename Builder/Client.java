package Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.createBuilder()
                .setName("Tom")
                .setAge(26)
                .setGender(Gender.MALE)
                .setUniversityName("VTU University")
                .setPhoneNumber("1234567890") 
                .build();

        System.out.println(student);
    }
}

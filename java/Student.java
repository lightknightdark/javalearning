public class Student extends User {
  public Student(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    void verify(){
        System.out.println("Verifying through email");
        set_verified(true);
    }
   
}

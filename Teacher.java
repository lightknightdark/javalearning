public class Teacher extends User {

    public Teacher(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    void verify(){
        System.out.println("Verifying through phone");
        set_verified(true);
    }
    
}

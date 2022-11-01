import java.util.ArrayList;
 // import java.util.List;

public class OOP {
    public static void main(String[] args) {
Student s = new Student("student");
Teacher  t =new Teacher("teacher");
System.out.println(t.get_name());
System.out.println(s.get_verified());





        System.out.println("Hello world!");
      //  User u =new User("Caleb","Silver");
    //    List<User>  users = new List<User>();
    User.admins= new ArrayList<User>();
      //  ArrayList<User> users = new ArrayList<User>();
      //  users.add(u);

      User.admins.add(new Teacher("Ken"));
      User.admins.add(new Student("you"));
      User.admins.add(new Teacher("me"));
      User.admins.add(new Student("lally"));
      User.admins.add(t);
      User.admins.add(s);

// User.print_admin_names();

 for(User u : User.admins){
        u.verify();
      }



  //    for(int i =0;i<users.size();i++){
    //      System.out.println(users.get(i).get_name());
    //  }

   //  for(User u : User.admins){
   //     System.out.println(u.get_name());
   //   }
      
   //     User u2 = u;
     //   User u2 = new User("Caleb","Silver");

      //  System.out.println(u == u2);

         // System.out.println(u.equals(u2));
      //  System.out.println(u2.get_membership());
    }
}

import java.util.List;

public abstract class User {
    private  String name =  null;
    private String membership = "Golden";

    public static List<User> admins;

    public static void print_admin_names(){
             for(User u : admins){
      System.out.println(u.get_name());
   }
      
    }

    private  boolean verified = false;

    void set_verified(boolean verified){
        this.verified = verified;
    }

    boolean get_verified(){
        return this.verified;
    }


    public String toString(){
        return get_name() +  "" + get_membership();
    }

    public boolean equals (User u2){
        if(get_name() == u2.get_name() && get_membership() == u2.get_membership()){ return true;} else return false;
    }

    public User(String name) {
        set_name(name);
      //  set_membership(membership);
    }


        void set_name(String name){
            this.name = name;
        }

        String get_name(){
            return this.name;
        }

        void set_membership(String membership){
            this.membership = membership;
        }

        String get_membership()
      {  return this.membership;}

      void set_membership(Membership membership){
        this.membership = membership.name();
      }

      void verify(){
        System.out.println("Verifying ....");
        set_verified(true);
    }

      public enum Membership{
        Bronze, Silver, Gold;
      }



}

package serialization;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "Ben";
        user.password = "123456";

      //  user.sayHello();


        FileOutputStream fileOutput = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutput);
        out.writeObject(user);
        out.close();
        fileOutput.close();

        System.out.println("the object is saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.print(serialVersionUID);
    }
    
}

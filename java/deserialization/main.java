package deserialization;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;
        FileInputStream fileInput = new FileInputStream("C:\\Users\\yeung\\Desktop\\EX\\java\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileInput);
        user = (User)in.readObject();
        in.close();
        fileInput.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

    }
}

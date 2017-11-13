import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SendObject {
    public static void main(String... args) throws IOException {
        Person person = new Person("Misha");

        try (Socket server = new Socket("localhost", 3000)) {


            OutputStream os = server.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(person);
            oos.flush();

        }

    }
}

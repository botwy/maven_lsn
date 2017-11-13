import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveObject {
    public static void main (String... args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(3000);
        try(Socket client = serverSocket.accept();
            InputStream is = client.getInputStream()) {
            ObjectInputStream in = new ObjectInputStream(is);
            Person person = (Person) in.readObject();
            System.out.print(person);

        }
    }
}

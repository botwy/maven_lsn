import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String... args) throws IOException {
        try (Socket server = new Socket("localhost", 3000)) {
            String command;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("enter command");
                command = scanner.nextLine();
                OutputStream os = server.getOutputStream();
                BufferedWriter br = new BufferedWriter(new OutputStreamWriter(os));
                br.write(command + "\n");
                br.flush();

            }
            while (!command.equals("exit"));
        }

    }
}

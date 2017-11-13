import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DatagramClient {

    public static void main (String... ags) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("localhost");

        try (DatagramSocket socket = new DatagramSocket();
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){

            String line;
            do { System.out.print("Enter message: ");
                line = console.readLine();
                byte[] bytes = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, 3000);
                socket.send(dp);
            } while (!line.equals("exit"));
        }
    }
}



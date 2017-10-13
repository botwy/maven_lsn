import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DatagramServer {

    public static void  main (String... args) throws IOException {

        try (DatagramSocket socket = new DatagramSocket(3000)) {
            byte[] buffer = new byte[1000];
            String command = "";
            do {
                DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);
                socket.receive(datagram);
                command = new String(datagram.getData(), 0, datagram.getLength());
                System.out.print(command);
            } while (!command.equals("exit"));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

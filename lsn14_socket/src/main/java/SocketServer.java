import com.sun.org.apache.xml.internal.security.Init;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketServer {

    public static void main (String... args) throws IOException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);


            try(ServerSocket serverSocket = new ServerSocket(3000)) {
                while (!serverSocket.isClosed()) {
                    Socket client = serverSocket.accept();
                    executorService.execute(new MyRunnable(client));
                }


            }




    }
}

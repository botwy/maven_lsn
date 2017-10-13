import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class MyRunnable implements Runnable{
    private  static Socket client;

    public MyRunnable(Socket client) {
        MyRunnable.client=client;
    }

    @Override
    public void run() {
        String command = "";
        InputStream in = null;
        try {
            in = client.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        do {
            try {
                command = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+" "+command);
        }
        while (!command.equals("exit"));
    }
}


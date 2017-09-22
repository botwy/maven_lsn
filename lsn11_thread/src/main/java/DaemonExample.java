public class DaemonExample implements Runnable{

    @Override
    public void run() {
        try {
            // invoke long task logic (> one second)
        } finally {
            System.out.println("Thread has done.");
        }
    }

    public  static void main (String[] args) throws InterruptedException {
        Thread t= new Thread(new DaemonExample());
      //  t.setDaemon(true);
        t.start();
        System.out.println("11111");
        t.join();
        System.out.println("Finish main");
    }
}

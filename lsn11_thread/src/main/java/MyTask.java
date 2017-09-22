public class MyTask implements Runnable {
    boolean b1;
    boolean b2;
    @Override
    public void run() {
       // for (int i = 0; i <2 ; i++) {
            System.out.println(Thread.currentThread().getName());
      //  }
    }

    public MyTask(){
        b1=true;
        Thread thread = new Thread(this);
        thread.start();
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b2=true;
    }

    public  static  void main (String[] args) {
        MyTask task = new MyTask();
      //  task.run();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
            System.out.println("Posle cikla");
        }
    }
}

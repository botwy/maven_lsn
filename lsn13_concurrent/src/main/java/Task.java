public class Task implements Runnable {
  private String taskinfo;

    public Task(String taskinfo) {
        this.taskinfo = taskinfo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()+" "+taskinfo);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

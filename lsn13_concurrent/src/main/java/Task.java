public class Task implements Runnable {
  private String taskinfo;

    public Task(String taskinfo) {
        this.taskinfo = taskinfo;
    }

    @Override
    public void run() {
        System.out.println(taskinfo);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

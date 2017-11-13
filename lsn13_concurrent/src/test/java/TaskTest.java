import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {


    public void test() {
      Runnable task = new Task("1");

        ExecutorService exec = Executors.newFixedThreadPool(5);
        exec.submit(task);
        exec.shutdown();



    }
}

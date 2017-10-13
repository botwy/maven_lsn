
import java.util.concurrent.*;

public class MainFutureTask {
    public static void main(String... args) {
        MyCallable callable = new MyCallable();
        FutureTask<String> futureTask =
                new FutureTask<String>(callable);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(futureTask);

        if (!futureTask.isDone()) {
            //wait indefinitely for future task to complete
            try {
                System.out.println("FutureTask output=" + 						futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

import java.util.concurrent.*;

public class MainTask {

    public static void main(String... args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 7; i++) {
            Task task = new Task("new_task" + i);
            executorService.submit(task);
        }

        executorService.shutdown();
    }
}
public class ThrowExceptionSimpleClass implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ThrowExceptionSimpleClass());
        t.setUncaughtExceptionHandler((t1, e) ->
                System.out.printf("Exception %s has been catch from thread %s",
                        e, t1.getName()));
        System.out.println("Finish main");
    }
}

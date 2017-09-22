public class PriorTask implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
        System.out.println(Thread.currentThread().getName()+
               " pr "+ Thread.currentThread().getPriority());
        Thread.yield();
         }
    }
    public  static  void main (String[] args) {

        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(new PriorTask());
            thread.setPriority(i%2==0?Thread.MAX_PRIORITY:Thread.MIN_PRIORITY);
            thread.start();

        }
    }

}

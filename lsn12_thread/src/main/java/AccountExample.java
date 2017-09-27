public class AccountExample implements Runnable{
    private Account acct = new Account();

    private void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            acct.withdraw(amt);
        }
    }

public static void  main (String[] args) throws InterruptedException {
AccountExample accountExample = new AccountExample();
Thread t1 = new Thread(accountExample);
Thread t2 = new Thread(accountExample);
t1.start();
t2.start();
accountExample.run();
t1.join();
t2.join();

}

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }
}
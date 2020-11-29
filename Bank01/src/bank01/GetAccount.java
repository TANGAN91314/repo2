package bank01;
import java.util.*;
public class GetAccount extends Thread {
    private Account money;

    public GetAccount(String name, Account money) {
        super(name);
        this.money = money;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (money) {
                Random r = new Random();
                int money2 = r.nextInt(1000);
                if (money2 < 500) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                String name = Thread.currentThread().getName();
                System.out.println(name+"取出了"+money2+"元");
            }
        }
    }
}


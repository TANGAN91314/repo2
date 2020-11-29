package bank01;
import java.util.*;

//存款相当与店主。存款线程。
public class SetAccount extends Thread {
    //根据账户类创建一个钱的对象。
    private Account money;

    public SetAccount(String name, Account money) {
        //构造定义线程的名字
        super(name);
        this.money = money;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (money) { //随机给一个值给money  如果它大于500 小于1000就可以存否则存不可
                Random r = new Random();
                //因为不理解什么时候失败，什么时候存款成功，就自定义一个条件（小于500的时候就存不进）
                int money1 = r.nextInt(1000);
                if (money1 < 500) {
                    //让它睡睡觉
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "成功存进" + money1 + "元");

                }
            }
        }
    }
}


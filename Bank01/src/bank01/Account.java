package bank01;
import java.util.*;
//  有余额才行
//
public class Account {
    Integer yuE;
    //先立一flag  看看银行是否有钱，假设开始不知道

    public Account() {
    }

    public Account(Integer yuE) {
        this.yuE = yuE;
    }

    public static void main(String[] args) {
        Account money = new Account();
        SetAccount sa = new SetAccount("存款人",money);
        GetAccount ga = new GetAccount("取款人",money);
        sa.start();
        ga.start();
    }
}

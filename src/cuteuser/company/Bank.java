package cuteuser.company;

public class Bank {
    int account = 100000;
    synchronized void getMoney() {
        account -= 3000;
    }
    synchronized void putMoney() {
        account += 3000;
    }
}

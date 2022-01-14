package cuteuser.company;

public class Client extends Thread {
    Bank bank;
    int money = 0;
    Client(Bank b) {
        this.bank = b;
        start();
    }

    void getMoney() {
        money = 3000;
        synchronized (bank) {
            bank.account -= money;
        }
    }
    void putMoney() {
        synchronized (bank) {
        bank.account += money;
        money = 0;
    }
    public void run() {
        while (true) {
            getMoney();
            putMoney();
        }
    }
}

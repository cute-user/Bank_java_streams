package cuteuser.company;

public class Client extends Thread {
    Bank bank;
    int money = 0;
    Client(Bank b) {
        this.bank = b;
        start();
    }

    public void run() {
        while (true) {
            bank.getMoney();
            bank.putMoney();
        }
    }
}

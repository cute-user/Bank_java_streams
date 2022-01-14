package cuteuser.company;

public class Client extends Thread {
    Bank bank;
    Client(Bank b) {
        this.bank = b;
        start();
    }

    public void run() {
        while (true) {
            synchronized (bank) {
                bank.getMoney();
                bank.putMoney();
            }
        }
    }
}

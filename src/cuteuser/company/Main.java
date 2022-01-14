package cuteuser.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        for(int i=0; i < 10; i++) {
            new Client(bank);
        }
        int i=0;
        while (true) {
            System.out.println(i++ + " Bank: " + bank.account);
        }
    }
}

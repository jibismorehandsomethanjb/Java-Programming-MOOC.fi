
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAcc = new Account("Matthews account", 1000.00);
        Account myAcc = new Account("My account", 0.00);
        matthewsAcc.withdrawal(100.00);
        myAcc.deposit(100.00);
        System.out.println(matthewsAcc.toString());
        System.out.println(myAcc.toString());
    }
}
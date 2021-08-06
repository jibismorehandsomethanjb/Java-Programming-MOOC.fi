
public class YourFirstAccount {

    public static void main(String[] args) {
        Account jibAccount = new Account("Jib", 100.00);
        jibAccount.deposit(20.0);
        System.out.println(jibAccount.toString());
    }
}

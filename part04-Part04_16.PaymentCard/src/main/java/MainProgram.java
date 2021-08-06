
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paul = new PaymentCard(20.0);
        PaymentCard matt = new PaymentCard(30.0);
        
        paul.eatHeartily();
        matt.eatAffordably();
        
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());
        
        paul.addMoney(20.0);
        matt.eatHeartily();
        
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());
        
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50.0);
        
        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());
    }
}

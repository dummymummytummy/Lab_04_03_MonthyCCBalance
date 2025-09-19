public class Main{
    public static void main(String[] args) {
        int balance = 5000;
        double rate =  0.17;
        int interest;
        System.out.println("Initial balance is : " + balance);
        interest = (int) (balance * rate);
        System.out.println("Interest for the first month is : " + interest);
        balance = balance + interest;
        System.out.println("Balance after first month is : " + balance);
        interest = (int)(balance * rate);
        System.out.println("Interest for the second month is : " + interest);

    }
}
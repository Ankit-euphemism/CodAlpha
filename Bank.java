import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        double balance=0.0;
        System.out.println ("1.Deposit");
        System.out.println ("2.Withdrawal");
        System.out.println ("3.Exit");
        System.out.println ();
        for (n=1;n<4;n++) {
            System.out.print ("Enter the choice:");
            n = sc.nextInt ();
            switch (n) {
                case 1:
                    System.out.print ("Enter the amount to be deposited: Rs.");
                    double amount = sc.nextDouble ();
                    balance += amount;
                    System.out.println ("Deposited Successfully." + "\nCurrent Balance is: Rs." + balance);
                    System.out.println ();
                    break;
                case 2:
                    System.out.print ("Enter the amount to withdraw: Rs.");
                    double draw = sc.nextDouble ();
                    if (draw <= balance) {
                        balance -= draw;
                        System.out.println ("Withdrawal successful.\nCurrent balance is: Rs." + balance);
                    } else if (draw <= 10.0) {
                        System.out.println ("Invalid Amount. Please withdraw more.");
                    } else {
                        System.out.println ("Insufficient balance.\nCurrent balance: Rs." + balance);
                    }
                    System.out.println ();
                    break;
                case 3:
                    System.out.println ("THANK YOU FOR VISITING.\nCLOSING THE APPLICATION.");
                    break;
                default:
                    System.out.println ("Invalid Option");
            }
        }
    }
}
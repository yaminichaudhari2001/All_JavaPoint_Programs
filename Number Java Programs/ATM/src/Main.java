import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Canara Bank");
        System.out.println("option 1 :Withdraw");
        System.out.println("option 2 :Deposit");
        System.out.println("option 3 :Check Bank Balance");
        System.out.println("option 4 :exit");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
               int balance=100000;
        int withdraw ,deposit;
        while (true){
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("enter your Amount to be withdraw");
                    withdraw=sc.nextInt();
                    if(withdraw<=balance) {
                        balance = balance - withdraw;
                        System.out.println("Money Successfully withdraw");
                    }
                    else
                    {
                        System.out.println("insufficient Balance");
                    }
                    break;

                }
                case 2:{
                    System.out.println("Enter your Amount to be deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your Money has been successfully depsited");
                    break;

                }
                case 3:{
                    System.out.println("your balance is "+balance);
                    break;
                }
                case 4:
                {
                System.exit(0);
                }
            }

        }
    }
}
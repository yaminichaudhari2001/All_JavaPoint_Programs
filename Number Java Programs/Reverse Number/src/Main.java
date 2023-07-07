import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" .....Reverse Number.....");
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem=0;
        int rev=0;
        while (n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse Number of "+temp+" is " +rev);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check Palindrome");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int rev=0;
        while(n!=0){
         int rem=n%10;
         rev=rev*10+rem;
         n=n/10;
        }
        if(num==rev)
        {
            System.out.println(num+" Palindrome number");
        }
        else {
            System.out.println(num+" Not Palindrome number");
        }

    }
}
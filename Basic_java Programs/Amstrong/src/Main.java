import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check Armastrong Number!");
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int digits=0;
        int last=0;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
        System.out.println(digits);
        temp=n;
        while(temp>0)
        {  last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        //System.out.println(sum);
        if(n==sum){
            System.out.println(n+" palindrome");
        }
        else {
            System.out.println(n+" Not Palindrome");
        }

    }
}
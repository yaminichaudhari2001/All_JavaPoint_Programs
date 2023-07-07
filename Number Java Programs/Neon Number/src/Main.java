import java.util.Scanner;

//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
// example=9 =9 pow 2=81=8+1=9
public class Main {
    public static void main(String[] args) {
        System.out.println("...........Neon Number..........");
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=(int)Math.pow(n,2);
        int sum=0;
        while (a!=0)
        {
            int rem=a%10;
             sum=sum+rem;
             a=a/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is Neon Number ");
        }
        else {
            System.out.println(n + " is Not Neon Number ");
        }
    }
}
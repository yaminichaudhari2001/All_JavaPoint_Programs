import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial Number");
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
import java.util.Scanner;
//A number is said to be Peterson if the sum of factorials of each digit is equal
// to the sum of the number itself.
//145 is person no.
public class Main {
    public static void main(String[] args) {
        System.out.println("......Peterson Number!");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int temp2=n;
        int fact=1;
        int sum=0;
        int rem=0;
        while( temp!=0)
        {
              rem = temp % 10;
              for ( int j = 1; j<=rem; j++)
             {
                fact = fact * j;
             }
            sum = sum + fact;
            fact=1;
            temp=temp/10;
        }
        System.out.println("sum is "+sum);
        if(sum==n)
        {
            System.out.println(n+" is a Peterson Number");
        }
        else {
            System.out.println(n+" is not a Peterson Number");
        }
    }
}
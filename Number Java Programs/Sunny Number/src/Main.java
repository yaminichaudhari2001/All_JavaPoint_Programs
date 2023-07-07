import java.util.Scanner;

//A number is called a sunny number if the number next to the given number is a perfect square.
// In other words, a number N will be a sunny number if N+1 is a perfect square.
//80 is sunny no
public class Main {
    public static void main(String[] args) {
        System.out.println("Sunny Number");
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n+1;
        double c=(Math.sqrt(n1));
        double d=c-Math.floor(c);
        if(d==0)
        {
            System.out.println("It is sunny number");
        }
        else {
            System.out.println("It is not sunny number");
        }


    }
}
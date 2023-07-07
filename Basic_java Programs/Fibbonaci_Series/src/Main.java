
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the no. for fibbonacci ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int i=0;
        System.out.println("Fibbonacci secies upto "+n);
        System.out.println(a);
        System.out.println(b);
        while ( i<=n)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }

    }
}
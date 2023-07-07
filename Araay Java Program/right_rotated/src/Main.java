import java.util.Scanner;

//13) Java Program to right rotate the elements of an array
public class Main {
    public static void main(String[] args) {
        System.out.println("Left Rotatea");
        int[] a={1,2,3,4,5};
        int n=a.length-1;
        Scanner sc=new Scanner(System.in);
        int nr= sc.nextInt();
        for (int i=0;i<nr;i++)
        {
            int last=a[n];
            int j;
            for ( j=n;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        for (int i=0;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
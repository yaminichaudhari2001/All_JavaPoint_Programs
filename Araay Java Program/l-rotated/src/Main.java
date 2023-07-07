import java.util.Scanner;

//3) Java Program to left rotate the elements of an array
public class Main {
    public static void main(String[] args) {
        System.out.println("Left Rotatea");
        int[] a={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int first=a[0];
            int j;
            for ( j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=first;
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
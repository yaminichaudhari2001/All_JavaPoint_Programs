import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       int m ,n,i,j;

        System.out.println("row");
         m=sc.nextInt();
        System.out.println("cloum");
         n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter value");
        for( i=0;i<m;i++)
            for ( j=0;j<n;j++)
                a[i][j]=sc.nextInt();


        System.out.println("element are");
        for( i=0;i<m;i++){
            for ( j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        }


}
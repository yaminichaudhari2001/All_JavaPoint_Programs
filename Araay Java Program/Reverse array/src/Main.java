//6) Java Program to print the elements of an array in reverse order
public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse array");
        int [] a={1,2,3,4,5,6};
        int n=a.length-1;
        int temp;
        for(int i=0;i<=n/2;i++)
        {
            temp=a[i];
           a[i]=a[n-i];
           a[n-i]=temp;

         }
        System.out.println("Reverse array is");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
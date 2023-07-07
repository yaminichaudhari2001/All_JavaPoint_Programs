//1) Java Program to copy all elements of one array into another array
public class Main {
    public static void main(String[] args) {
        System.out.println("Copy Array");
        int [] a=new int[]{1,2,3,4,5,6};
        int [] b=new int[a.length];
        System.out.println(a.length);
        for(int i=0;i< a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("elemenr of a array");
        for(int i=0;i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("elemenr of b array");
        for(int i=0;i< a.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
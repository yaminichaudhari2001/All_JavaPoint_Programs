//22) Java Program to Print Odd and Even Numbers from an array
public class Main {
    public static void main(String[] args) {
        System.out.println("Print odd and Even element of array");
        int [] a={1,3,24,5,7,8,9,10};
        System.out.println("Evern number of array");
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("odd number of array");
        for (int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
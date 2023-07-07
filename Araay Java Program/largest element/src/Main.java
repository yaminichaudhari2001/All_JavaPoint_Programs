//9) Java Program to print the largest element in an array
public class Main {
    public static void main(String[] args) {
        System.out.println("largest element of array");
        int [] a={1,5,3,6,8,11,10};
        for(int i=0;i<a.length;i++)
        { int temp=0;
            for (int j=0;j<a.length;j++)
            { if(a[i]<a[j])
            {
               temp=a[i] ;
               a[i]=a[j];
               a[j]=temp;

            }
            }
        }
        System.out.println("largest element is "+a[a.length-1]);
    }
}
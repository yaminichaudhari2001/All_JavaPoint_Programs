//12) Java Program to print the sum of all the items of the array
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of array");
        int [] a={1,5,4,3,7,4};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of array elment is "+sum);
    }
}
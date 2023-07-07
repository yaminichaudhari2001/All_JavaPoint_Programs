//7) Java Program to print the elements of an array present on even position
public class Main {
    public static void main(String[] args) {
        System.out.println("Even Position");
        int [] a={1,2,3,4,5,6,7,8};
        for (int i=1;i<a.length;i=i+2)
        {

            System.out.println(a[i]+" ");

        }
    }
}
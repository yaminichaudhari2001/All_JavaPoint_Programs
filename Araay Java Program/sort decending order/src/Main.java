//15) Java Program to sort the elements of an array in descending order
public class Main {
    public static void main(String[] args) {
        System.out.println("Sort array in decending order");
        int[] a={1,4,66,33,45};
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++) {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted arrya is");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
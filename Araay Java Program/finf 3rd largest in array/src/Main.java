//16) Java Program to Find 3rd Largest Number in an array
public class Main {
    public static void main(String[] args) {
        System.out.println("3 rd largest in array");
        int[] a={1,4,66,33,45};
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++) {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("3rd largest  element arrya is "+a[a.length-3]);
    }
}
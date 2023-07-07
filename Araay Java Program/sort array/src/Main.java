//23) How to Sort an Array in Java
public class Main {
    public static void main(String[] args) {
        System.out.println("sort array");
        int[] a={2,5,6,54,3};
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

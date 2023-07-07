//21) Java Program to Remove Duplicate Element in an array
public class Main {
    public static void main(String[] args) {
        System.out.println("Remove Dublicate element of array");
        int[] a={1,11,1,2,3,3};
        int n=a.length;
        if (n==0 || n==1){
            System.out.println(n);
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];
        for (int i=0; i<j; i++){
            a[i] = temp[i];
        }
        System.out.println(a[j]);

    }
}
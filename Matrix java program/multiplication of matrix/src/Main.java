//3) Java Program to Multiply Two Matrices
public class Main {
    public static void main(String[] args) {
        System.out.println("multiplcation of matrix");
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,1,3},{2,4,3},{3,4,5}};
        int c[][]=new int[3][3];

        for(int i=0;i<a.length;i++){

                for(int j=0;j<a.length;j++) {
                    for(int k=0;k<a.length;k++){
                    c[i][j] = a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
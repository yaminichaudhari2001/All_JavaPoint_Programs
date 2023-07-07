//4) Java Program to subtract the two matrices
public class Main {
    public static void main(String[] args) {
        System.out.println("substract array");
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,1,3},{2,4,3},{3,4,5}};
        int c[][]=new int[3][3];

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++) {

                    c[i][j] = a[i][j] - b[i][j];

                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}
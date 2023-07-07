//5) Java Program to determine whether two matrices are equal
public class Main {
    public static void main(String[] args) {
        System.out.println("Check Two Mtrix are equal or not");
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,6},{2,4,5},{3,4,5}};
        int row1=a.length;
        int col1=a[0].length;
        int row2=b.length;
        int col2=b[0].length;
        boolean flag=true;
        if(row1!=row2 || col2!=col1)
        {
            System.out.println("both matrix not equal");
        }
        else {
            for (int i = 0; i < row1; i++) {

                for (int j = 0; j < col1; j++) {

                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }
                }

                }
            }
            if(flag=false) {
                System.out.println("Matrix are not equal");
            } else {
                System.out.println("Matrix  are equal");

            }

        }
}
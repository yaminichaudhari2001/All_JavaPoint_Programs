//7) Java Program to display the upper triangular matrix
public class Main {
    public static void main(String[] args) {
        System.out.println("upper trigular matix");
        int[][] a={{1,2,3},{1,2,3},{1,2,3}};
        int row=a.length;
        int col=a.length;
        if(row!=col)
        {
            System.out.println("matrix should be square matrix");
        }
        else {
            for (int i=0;i<a.length;i++)
            {
                for (int j=0;j<a.length;j++)
                {
                    if(j>i)
                    {
                        System.out.print("0 ");
                    }
                    else {
                        System.out.print(a[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
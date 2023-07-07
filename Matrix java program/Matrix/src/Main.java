public class Main {
    public static void main(String[] args) {
        System.out.println(" Matrix array");
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
//4) Java Program to print the duplicate elements of an array.
public class Main {
    public static void main(String[] args) {
        System.out.println("Dublicate Elemnent");
        int [] a={6,1,1,2,3,3,4,5,6};
        for (int i=0;i<a.length;i++)
        {    int j;
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[j]);
                }
            }


        }
    }
}
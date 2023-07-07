//2) Java Program to find the frequency of each element in the array
public class Main {
    public static void main(String[] args) {
        System.out.println("Frequency in array");
        int [] a={1,2,3,4,5,6,6,6,7,7,1,2};
        int size=a.length;

        for(int i=0;i<size;i++)
        {
            int count=0;
            int flag=0;
            for (int j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                  flag=1;
                    break;
                }
            }
            if(flag==1)
                continue;
            for(int j=0;j<=i;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            System.out.println(a[i]+" : "+count);
        }
    }
}
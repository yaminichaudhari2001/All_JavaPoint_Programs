import java.util.Scanner;

//A number is called a tech number if the given number has an even number of digits and
// the number can be divided exactly into two parts from the middle.
// After equally dividing the number, sum up the numbers and find the square of the sum.
// If we get the number itself as square, the given number is a tech number, else, not a tech number.
// For example, 2025,3025 is a tech number.
public class Main {
    public static void main(String[] args) {
        System.out.println("Tech Number");
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int temp2=n;
        int digit=0;
        while(temp!=0)
        {
            temp=temp/10;
            digit++;
        }
        if(digit%2==0)
        {
            System.out.println("even digit");
            int half=digit/2;
            int a=(int)Math.pow(10,half);
            int part2=temp2%a;
            int part1=temp2/a;
           // System.out.println(part1);
            //System.out.println(part2);
            int b=part1+part2;
            int c=(int)Math.pow(b,2);
            if(c==n)
            {
                System.out.println(n+" is Tech Number");
            }
            else
            {
                System.out.println(n+" is Not Tech Number");
            }

        }
    }
}
import java.util.Scanner;

//A number is called an automorphic number if and only if the square of the given number
// ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625
// and 5776,
// respectively and the last two digits of the square represent the number itself.
public class Main {
    public static void main(String[] args) {
        System.out.println("Automorphic Number");
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sqr=(int)Math.pow(n,2);
        System.out.println(sqr);
        int digit=0;
        int flag=0;
        int n_sqr=sqr;
        while(n_sqr>0)
        {
            n_sqr=n_sqr/10;
            digit++;
        }

        int dig=10;
        while (digit>0)
        {

           int temp=sqr%dig;
           if(temp==n)
           {
              flag=1;
               break;
           }
            temp=0;
           dig=dig*10;
           digit--;

        }
        if(flag==1)
        {
            System.out.println(n+" is Automorphic Number");
        }
        else {
            System.out.println(n+" is Not Automorphic Number");
        }


    }
}
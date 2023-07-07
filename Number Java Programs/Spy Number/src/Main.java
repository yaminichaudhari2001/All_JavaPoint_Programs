//A positive integer is called a spy number if the sum and product of its digits are equal.
// In other words, a number whose sum and product of all digits are equal is called a spy number.
//ex=1124=1+1+2+4=8 and 1*1*2*4=8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spy Number!");
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=n;
        int sum=0;
        int prod=1;
        while(temp1!=0)
        {
            int rem=temp1%10;
            sum=sum+rem;
            prod=prod*rem;
            temp1=temp1/10;
        }
        if(sum==prod)
        {
            System.out.println(n+" is Spy Number");
        }
        else {
            System.out.println(n+" is Not  Spy Number");
        }

    }
}
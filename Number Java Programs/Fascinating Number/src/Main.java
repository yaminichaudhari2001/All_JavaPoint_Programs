import java.util.Scanner;

//Multiplying a number by two and three separately, the number obtained by writing the results obtained with
// the given number will be called a fascinating number. If the result obtained after concatenation
// contains all digits from 1 to 9, exactly once.
//Let's take any number (n) say 327 and check whether the given number is fascinating or not.
// On multiplying the given number (n) by 2 and 3, we get:
//327×2=654
//327×3=981
//327"+"654"+ "981"= 327654981
//For example, 192, 1920, 2019, 327, etc.
public class Main {
    public static void main(String[] args) {
        System.out.println("Fascinating Number");
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=n*2;
        int b=n*3;
        String c=n+""+a+b;
        System.out.println(c);

    }
}
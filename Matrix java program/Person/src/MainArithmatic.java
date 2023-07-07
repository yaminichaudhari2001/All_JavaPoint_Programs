import java.util.Scanner;

class Arithmatic{
     public int add(int x,int y)
    {
      return x+y;
    }
     int sub(int x,int y)
    {
        return x-y;
    }

     int mul(int x,int y)
    {
        return x*y;
    }

     int div(int x,int y)
    {
        return x/y;
    }


}
public class MainArithmatic extends Arithmatic {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MainArithmatic ob=new MainArithmatic();
        System.out.println("Enter the two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the choice");

        int ch = sc.nextInt();
        switch (ch){
            case 1: {
                System.out.println("addition is");
                System.out.println(ob.add(x, y));
                break;
            }
            case 2:{
                System.out.println("subtraction is");
                System.out.println(ob.sub(x,y));break;}
            case 3:{
                System.out.println("Multiplication is");
                System.out.println(ob.mul( x,y));break;}
            case 4:{
                System.out.println("Division is");
                System.out.println(ob.div(x,y));break;}
            default:
                System.out.println("plese enter valid choice");
        }

    }
}

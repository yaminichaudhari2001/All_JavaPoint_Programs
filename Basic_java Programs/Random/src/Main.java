import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random Number");
        double a=Math.random();
        System.out.println(a);
        int b=(int)(Math.random()*100);
        System.out.println(b);
        int c=(int)((Math.random()*10)%8);//1 to 8 random no
        System.out.println(c);
        Random rd=new Random();
        int d= rd.nextInt(50);
        System.out.println(d);

    }
}
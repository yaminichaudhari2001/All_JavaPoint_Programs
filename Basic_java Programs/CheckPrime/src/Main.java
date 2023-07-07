import java.util.Scanner;

public class Main {
    void checkprime(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
      for(int i=2;i<=n/2;i++)
      {
          if(n%i==0){
            flag=1;
          }
      }
      if(n==0||n==1){
          System.out.println(n+" not Prome");
      }
        else if(flag==1){
            System.out.println(n+" Not Prime");
        }
        else {
            System.out.println(n+" is Prime");
        }


    }
    public static void main(String[] args) {
        System.out.println("Check Prime or not");
        Main a=new Main();
        a.checkprime();
    }
}
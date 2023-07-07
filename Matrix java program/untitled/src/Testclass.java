interface a{
    default void show()
    {
        System.out.println("a");
    }
}
interface b extends a{
    default void show()
    { a.super.show();
        System.out.println("b");
    }

}
interface c extends a {
    default void show()
    {
        a.super.show();
        System.out.println("c");
    }


}

public class Testclass implements b,c{
    public void show(){
       b.super.show();
       c.super.show();
    }

    public static void main(String[] args) {
Testclass ob=new Testclass();
ob.show();

    }
}


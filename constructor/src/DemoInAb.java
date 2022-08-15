interface demo{
    void a();
    void b();
    void c();
    void d();
}
abstract class Abs implements demo{
    public void c(){
        System.out.println("I am C!!");
    }
}
 class Abs2 extends Abs{
    public void a(){
        System.out.println("I am a!!");
    }
    public void b(){
        System.out.println("I am b!!");
    }
    public void d(){
        System.out.println("I am d!!");
    }

}

public class DemoInAb {
    public static void main(String [] args){
        System.out.println("****Print Message***");
        demo d = new Abs2();
        d.a();
        d.b();
        d.c();
        d.d();


    }
}

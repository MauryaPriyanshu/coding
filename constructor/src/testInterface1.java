interface drawable{
    void draw();
}
class Rectangle5 implements drawable{
    public void draw(){
        System.out.println("Rectangle is drawing!! ");
    }
}
class Circle implements drawable{
    public void draw(){
        System.out.print("Circle are drawing!!");
    }
}
public class testInterface1 {
    public static void main(String[] args){
        System.out.println("*** Print the message***");
        drawable print;
        print = new Rectangle5();
        print.draw();
        print = new Circle();
        print.draw();
    }

}

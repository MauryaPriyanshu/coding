//example of an abstract class that has abstract and non abstract methods.
abstract class Shape2 {
    Shape2() {
        System.out.println(" All objects have the shape!!");
    }

    // abstract method is not instentiated
    abstract void length();

    void width() {
        System.out.println("All object have length and width also!!");
    }
}
    class Rectengle2 extends Shape2{
    void length(){
        System.out.println("Rectangle have length and width!!");

    }
}
public class testAbstract{
    public static void main(String[] args){
        Shape2 s = new Rectengle2();
        s.length();
        s.width();
    }
}
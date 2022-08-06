class Shape{
    void draw(){
        System.out.println("Drawing");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
       System.out.println("Drawing Rectangle");
    }
}
class Square extends Shape {
    void draw() {
        System.out.println("Shape drawing Square");
    }
}
public class TestPolymorphism2 {
    public static void main(String[] args){
        Shape shape;
        shape = new Rectangle();
        shape.draw();
        shape = new Square();
        shape.draw();

    }
}

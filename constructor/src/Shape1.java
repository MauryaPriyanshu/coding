abstract class Shape1 {
    Shape1(){
        System.out.println("All objects have a shape!!");
    }
    abstract void draw();
}


    class Rectangle1 extends Shape1 {
        void draw() {
            System.out.println("Rectangle are drawn!!");
        }
    }

    class Circle1 extends Shape1 {
        void draw() {
            System.out.print("Circle is the type of shape!!");
        }


        public static void main(String[] args) {
            System.out.println("Shape have body!!");
            Shape1 r;
            r = new Rectangle1();
            r.draw();
            r = new Circle1();



        }
    }



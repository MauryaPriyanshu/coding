 class Animal1 {
     String color = "Black";
 }
    class Dog extends Animal1{
        String color = "Red-White";
         void printColor(){
            System.out.println("Print color :" + color);
            System.out.println("Print color of Dog is:" + super.color);
        }
    }
 public class Animal{

    public static void main(String[] args){
        Dog d = new Dog();
        d.printColor();
    }
}


 class Animal2 {
     void eat(){
        System.out.println("Animals are eating!!");
    }
}
class Dog1 extends Animal2{
    void eat(){
        System.out.println("Dogs are eating!!");
    }
    void walk(){
        System.out.println("Animal and Dogs are walking!!");
    }
    void speak() {
        System.out.println("Animal and Dog are speeking");

        super.eat();

        walk();
    }

}
public class UsedSuper{
    public static void main(String[] args){
        Dog1 dog = new Dog1();
        dog.speak();
        dog.eat();
    }
}

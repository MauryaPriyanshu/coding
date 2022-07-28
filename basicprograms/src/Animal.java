 class Animaltype {
    void eat() {
        System.out.println("Animals are eating!!");
    }
}
    class Dog extends Animaltype {
        void bark() {
            System.out.println("barking...");
        }
    }
    public class Animal{
        public static void main(String[] args){
            Dog d = new Dog();
            d.bark();
            d.eat();
        }
}


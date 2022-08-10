 class AnimalDemo1 {
    void speak(){
        System.out.println("Animals are speak");
    }
}
class DogDemo extends AnimalDemo1 {
    void speak() {
        System.out.println("Dogs are speak");
    }

    void walk() {
        System.out.println("Dogs are walk");
        super.speak();
    }
}
    public class AnimalDemo{
        public static void main(String[] args){
            DogDemo dog = new DogDemo();
            dog.speak();
            dog.walk();
        }
    }



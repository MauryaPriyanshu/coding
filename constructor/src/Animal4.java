public class Animal4 {}
    class Dog4 extends Animal4{
    static void method(Animal4 a){
        if(a instanceof Dog4){
            System.out.println("Ok downcasting is perform");
        }
    }
    public static void main(String[] args){
        Animal4 a = new Dog4();
        Dog4.method(a);

    }

}


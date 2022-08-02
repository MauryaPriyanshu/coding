class Animal3 {
    Animal3() {
        System.out.println("Different kind of Animal present in the univers!!");
    }
}
    class Cat extends Animal3 {
        Cat() {
            super();
            System.out.println("Cats is one of the kind of animals!! ");
        }
    }
    public class UsedSuper2{
        public static void main(String[] args){
            Cat cat = new Cat();
        }
    }



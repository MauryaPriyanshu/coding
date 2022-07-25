abstract class AbstractMethod {
    //the method that does not have method body is called abstract method.
    abstract void display();
}
 class MyClass extends AbstractMethod {
    void display() {
        System.out.println("Abstract Method?");
    }

    public static void main(String[] args) {
        AbstractMethod obj = new MyClass();
        obj.display();
    }
}




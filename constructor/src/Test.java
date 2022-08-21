class PrivateModifierDemo {
    public PrivateModifierDemo(){}
     void msg(){
        System.out.println("Welcome to Private access modifier!!");
    }
}
public class Test{
    public static void main(String[] args){
        PrivateModifierDemo pmd = new PrivateModifierDemo();
         pmd.msg();

    }
}

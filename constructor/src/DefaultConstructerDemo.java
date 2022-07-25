public class DefaultConstructerDemo {
    int id;
    String name;

    public void display() {

        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        System.out.println("check the value of default constructer:--");
        DefaultConstructerDemo id1 = new DefaultConstructerDemo();
        DefaultConstructerDemo name1 = new DefaultConstructerDemo();
        id1.display();
        name1.display();
    }
}





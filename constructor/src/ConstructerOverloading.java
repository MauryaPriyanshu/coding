public class ConstructerOverloading {
    int id;
    String name;
    int age;
    ConstructerOverloading(int i, String n){
        id = i;
        name = n;
    }
    ConstructerOverloading(int i1 , String n1, int a){
        id = i1;
        name = n1;
        age = a;
    }
    void display(){
        System.out.println(id + "" + name);
        System.out.println(id + "" + name + " "+age);
    }
    public static void main(String [] args){
        System.out.println("It is  constructer overloading:");
        ConstructerOverloading s1 = new ConstructerOverloading(11, "priyanshu");
        ConstructerOverloading s2 = new ConstructerOverloading(79,"Shivangi",22);
        s1.display();
        s2.display();

    }
}

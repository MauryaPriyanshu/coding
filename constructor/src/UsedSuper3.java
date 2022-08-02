 class Person{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}
class Employee extends Person{
    float salary;
    Employee(int id, String name,float salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee Information:  " + id + ", " + name + ", " +salary + " .");
    }
}
public class UsedSuper3{
    public static void main(String[] args){
        Employee emp = new Employee(79,"Priyanshu Maurya", 50_0000f);
        emp.display();
    }
}

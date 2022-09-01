public class EncapsulationDemo {
    private String name;
    private int rollno;

    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }

    public static void main(String[] args){
        System.out.println("It is example of encapsulation. in this example use get and set method!");
        System.out.println("*** Print the Message ***");
        EncapsulationDemo sc = new EncapsulationDemo();
        sc.setName("Priyanshu Maurya");
        System.out.println("Name: " + sc.getName());
        sc.setRollno(19);
        System.out.println("Rollno: " + sc.getRollno());
    }

}

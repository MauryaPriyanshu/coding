public class StaticVariable {
    int rollno;
    String name;
    static String college = "srmcem";
    StaticVariable(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + " " +name+" " +college);

    }
    public static void main(String[] args){
        StaticVariable s1 = new StaticVariable(79,"Priyanshu");
        StaticVariable s2 = new StaticVariable(103,"shivangi");
        StaticVariable s3 = new StaticVariable(56, "aadvic");
        s1.display();
        s2.display();
        s3.display();
    }
}

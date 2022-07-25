public class StaticMethod {
    int rollno;
    String name;
    static String college = "srmcem";
    StaticMethod(int r,String n){
        rollno = r;
        name = n;

    }
    static void change(){
        college = "bbdnitm";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public static void main(String[] args){
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(79,"priya");
        StaticMethod s2 = new StaticMethod(93,"priyanshu");
        s1.display();
        s2.display();
    }

}

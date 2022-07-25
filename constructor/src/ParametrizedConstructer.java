public class ParametrizedConstructer {
    int id;
    String name;
    ParametrizedConstructer(int i, String n){
        id = i;
        name = n;}
        void display(){
            System.out.println(id +" "+ name);
        }


    public static void main(String[] args){
        ParametrizedConstructer s1 = new ParametrizedConstructer(79, "Priyanshu");
        ParametrizedConstructer s2 = new ParametrizedConstructer(103, "Shivangi");
        s1.display();
        s2.display();

    }
}

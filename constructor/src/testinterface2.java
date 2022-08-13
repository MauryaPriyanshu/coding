interface printable1{
    void print();
}
interface showable1 extends printable1{
    void show();
}
class testinterface2 implements showable1 {
    public void print(){
        System.out.println("printing!!");
    }
    public void show(){
        System.out.println("Showing!!");
    }

    public static void main(String[] args){
        testinterface2 test = new testinterface2();
        test.print();
        test.show();
    }
}

//Example of multiple inheritence.

interface printable{
    void print();
}
interface showable{
    void show();
}
interface draawable{
    void draw();
}
class MultipleInheritence implements printable,showable,drawable{
    public void print(){
        System.out.println("Used for printing!!");
    }
    public void show(){
        System.out.println("Used for showing !!");
    }
    public void draw(){
        System.out.println("Used for drawing!!");
    }



    public static void main(String [] ag){
        MultipleInheritence p = new MultipleInheritence();
        p.print();
        p.show();
        p.draw();

    }
}

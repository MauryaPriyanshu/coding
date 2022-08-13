interface testInterface {
    void print();
}
    class Printable implements testInterface{
        public void print(){
            System.out.println("Learn about interface!!");
        }
        public static void main(String[] args){
            System.out.println("Java compiler add public,static and final keyward before interface method!!");
            Printable printmsg = new Printable();
            printmsg.print();

        }

}

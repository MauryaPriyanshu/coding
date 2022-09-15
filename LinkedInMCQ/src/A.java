 class A {
    public void volt(){
        System.out.println("I am A");
    }
    class B extends  A {
        public void volt() {
            System.out.println("I am B");
        }
    }
        class C extends B{
            public void volt(){
                System.out.println("I am C");
            }
        }
        public static void main(String[] args){
            A x = new B();
            x.volt();
        }

}

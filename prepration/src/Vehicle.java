 class Vehicle {
     void run() {
         System.out.println("Vehicle running");
     }
 }
    class Bike extends Vehicle {
        void run() {
            System.out.println("Bike running");
        }

    public static void main(String[] args){
        Bike obj = new Bike();
        obj.run();
    }

}

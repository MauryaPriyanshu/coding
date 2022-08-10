public class BikeDemo {
    final void run(){
        System.out.println("Bikes are running");
    }
}
class Honda extends BikeDemo{

    public static void main(String[] args){
        new Honda();
        System.out.println("Honda is a type of Bike");
    }
}

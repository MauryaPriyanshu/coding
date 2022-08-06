public class Bike {
    void run() {
        System.out.println("running");
    }
}
        class Splendor extends Bike {
            void run() {
                System.out.println("Splendor bike running at the speed of 80 Kmph");
                super.run();

            }

            public static void main(String[] args) {
                Bike b = new Splendor();
                b.run();
            }
}



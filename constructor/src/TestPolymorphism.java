 class Bank {
    float getRateOfInterest() {
        return 0;
    }
}
    class SBI extends Bank
    {
        float getRateOfInterest()
        {
            return 6.9f;
        }
    }
    class ICICI extends Bank{
        float getRateOfInterest(){
            return 7.9f;
        }
    }
    class Axis extends Bank {
        float getRateOfInterest() {
            return 8.6f;
        }
    }
    class Baroda extends Bank{
        float getRateOfInterest(){
            return 9.8f;
        }
    }
    public class TestPolymorphism {
        public static void mian(String[] args) {
            Bank b;
            b = new SBI();
            System.out.println("SBI Rate of Interest is: " + b.getRateOfInterest());
            b = new ICICI();
            System.out.println("ICICI Rate of Interest is: " + b.getRateOfInterest());
            b = new Axis();
            System.out.println("Axis Rate of Interest is: " + b.getRateOfInterest());
            b = new Baroda();
            System.out.println("Baroda Rate of Interest is: " + b.getRateOfInterest());
        }
    }








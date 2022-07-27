public class HelloWorld {
    public static void main(String[] args){

        System.out.println(Runtime.getRuntime().availableProcessors());
        double startTime = System.currentTimeMillis();
        System.out.println("started time - " + startTime);
        for(int i = 1; i <= 10_000; i++){
//            System.out.println("Hello World!!");
//            Math.sqrt(10032);
        }
        double endTime = System.currentTimeMillis();

        System.out.println("total timme im ms = " + (endTime-startTime));

        System.out.println("total timme im second = " + (endTime-startTime)/1000);

        System.out.println("total timme im min = " + (endTime-startTime)/(1000*60));


    }
}

package fun;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    //Runnable interface
    // Thread class

    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setPriority(1);
//        System.out.println("HH Hello World by thread name --- "
//                + Thread.currentThread().getName() + "~"
//                + Thread.currentThread().getThreadGroup().getName()+ "~"
//                + Thread.currentThread().getPriority());

        double startTime = System.currentTimeMillis();
        System.out.println("started time - " + startTime);

        List<Thread> list = new ArrayList<>();

        for(int i=0;i<=4; i++) {
            Thread myThread = new Thread(new MyRunnable());
//            myThread.setPriority(2);
            myThread.start();
//            myThread.join();
            list.add(myThread);
        }

//       while ()
//        Thread.currentThread().join();
        double endTime = System.currentTimeMillis();

        System.out.println("total timme im ms = " + (endTime-startTime));

        System.out.println("total timme im second = " + (endTime-startTime)/1000);

        System.out.println("total timme im min = " + (endTime-startTime)/(1000*60));
    }



     static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<=2500; i++) {
                System.out.println("Hello World by thread name --- ");
            }
        }
    }
}

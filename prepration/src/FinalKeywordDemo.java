 class FinalKeywordDemo {
    final int speedlimit = 400;
     void run()
    {
//        speedlimit = 500;
        System.out.print("Speedlimit of bike is :" + speedlimit);
     }
    public static void main(String[] args){
        FinalKeywordDemo bike = new FinalKeywordDemo();
        bike.run();
    }


}

//finite loop
public class RecursionDemo {
    static int count = 0;
    static void test() {
        count++;
        if (count <= 5)
        {
            System.out.println("hello.."+ count);
            test();
        }
    }
    public static void main(String[] args){
        test();
    }
}

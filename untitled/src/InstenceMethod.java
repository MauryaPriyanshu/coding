public class InstenceMethod
{
    public static void main(String[] args){
        InstenceMethod obj = new InstenceMethod();
        System.out.println("the sum is:" +obj.add(12,19));
    }

    public int add(int i, int i1) {
        int s = i + i1;
        return s;
    }
}

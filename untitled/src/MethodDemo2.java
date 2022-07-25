public class MethodDemo2 {
    public static void main(String [] args){
        int a =17;
        int b = 89;
        int c = add(a,b);
        System.out.println("The sum of a and b is = " +c);

    }
    public static int add(int n1,int n2)
    {
        int s;
        s = n1+n2;
        return s;
    }
}

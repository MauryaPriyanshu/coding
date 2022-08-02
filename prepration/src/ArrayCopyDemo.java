import static java.lang.System.arraycopy;

public class ArrayCopyDemo {
    public static void main(String[] args){
        char[] copyForm = {'P','R','I','Y','A','N','S','H','U'};
        char[] copyTo = new char[9];
        System.arraycopy(copyForm, 0,copyTo,0,9);
        System.out.println(String.valueOf(copyTo));
    }
}

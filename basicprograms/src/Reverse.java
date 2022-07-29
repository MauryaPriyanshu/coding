public class Reverse {
    public static void main(String[] args){
        String str = "priyanshu";
        char arr[] = str.toCharArray();
        int length = arr.length;
        System.out.println("Original String is: priyanshu");

        for(int i = 0; i < length/2; i++){
           char temp = arr[i];
           arr[i] = arr[length-i-1];
           arr[length-i -1]  = temp;
        }
        System.out.println("reverse the string is: ");
        for(int i = 0; i < length;i++){
           System.out.print(arr[i]);
        }
    }
}

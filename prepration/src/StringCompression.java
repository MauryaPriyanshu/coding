public class StringCompression {
    public static void main(String[] args){
        String str = "aabbbbcpppppxdddd";

        StringCompression stringCompression = new StringCompression();

      stringCompression.compressString(str);

    }

    String compressString(String input){
        System.out.println("Input string - " + input);
        System.out.println("Compressing the input string ....");

        int length = input.length();
        String res = String.valueOf(input.charAt(0));
        int counter = 1;

        for(int i = 1; i < length; i++){
            if(input.charAt(i-1) ==input.charAt(i))
            {
                counter++;
            }
            else{
                res = res + counter + input.charAt(i);
                counter = 1;
            }
        }

        res= res+counter;// for the last character which was not considered in the for loop

        System.out.println("result of the compression string is:" + res);

        return res;
    }
}

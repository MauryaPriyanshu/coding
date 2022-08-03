public class ReverseSentence {
    public static void main(String[] args){
        String sentence = "Tarak mehta ka ulta chashma";
        String string[] = sentence.split(" ");
        String reverse = " ";

        for(int i = 0; i < string.length; i++)
        {
           if(i == string.length - 1){
               reverse = string[i] + reverse;
           }
           else{
               reverse = " "+string[i]+reverse;
           }
        }
        System.out.println("Reversed sentence :" + reverse);
    }
}

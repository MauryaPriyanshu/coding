public class Strings {
public static void main(String[] args){
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    // char at index 0
//    System.out.println(sb.charAt(0));
//    // set char at index 0
//    sb.setCharAt(0,'p');
//    System.out.println(sb);

      sb.insert(2, 'n');
    System.out.println(sb);

    // delete the extra n
    sb.delete(2,3);
    System.out.println(sb);

    // append meas add in last
    sb.append("s");
    sb.append("t");
    sb.append("a");
    sb.append("r");
    sb.append("k");
    System.out.println(sb.length());


}
}

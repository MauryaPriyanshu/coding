public class FindAccOFSubString {
    public static void main(String[] args){
        String parent = "TimisplayingTimiscrying";
        String sub = "Tim";
        int M = parent.length();
        int N = sub.length();
        int ans = 0;
        for(int i =0; i <= M-N; i++){
            int j;
            for(j = 0; j < N; j++) {
                if (parent.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }

                if(j == N){
                    ans++;
                    j = 0;
                }
        }
        System.out.print("Print the accurence of the sub String : " + ans);

    }
}

public class FindRockSample {

    public int[] isFindRockSample(int sample[], int ranges[][], int sLength,int rLength){
        int[] result = new int[rLength];

        for(int i = 0; i < rLength; i++) {
            int count = 0;
            int l = ranges[i][0];
            int h = ranges[i][1];

            for( int j = 0; j < sLength;j++)
            {
                if (l <= sample[j] && sample[j] <= h)
                    count = count + 1;
            }

            result[i] = count;


        }
        return result;


    }
    public static void main(String [] args){
        int sample[] = {400, 567, 890, 765, 987};
        int ranges[][] = {  { 300, 1380 }, { 800, 1000 } };
        int sLength = sample.length;
        int rLength = ranges.length;

        FindRockSample ans = new FindRockSample();
        int myreuslt[] = ans.isFindRockSample(sample,ranges,sLength,rLength);

        for(int res : myreuslt) {
            System.out.print(res +", ");
        }
    }
}

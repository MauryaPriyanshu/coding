import java.util.Arrays;

public class FindMeanMedian {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 4};
        int length = arr.length;

        System.out.println("Print the mean:" + findMean(arr,length));
  //      System.out.println("Print the median:" + findMedian(arr,length));
    }

    public static double findMean(int arr[], int length) {
        int sum = 0;
        for (int i = 0; i < length; i++)
        {
           sum = sum + arr[i];
        }
          return (double) sum / (double) length;
    }


}


//        Arrays.sort(arr);
//        if(length % 2 != 0)
//        {
//            System.out.println(arr[length/2]);
//        }
//        else {
//            double m1 = arr[([(length -1)/2] + arr[length/2])/2.0;
//            System.out.println(m1);
//        }
//    }
//}

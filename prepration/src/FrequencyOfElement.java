import java.nio.file.FileSystemNotFoundException;

public class FrequencyOfElement {

    public static void main(String[] arge) {

        int[] arr = {11, 29, 11, 23, 11, 23, 11};
        int[] newarr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < arr.length ; j++)
            {
                if (arr[i] == arr[j])
                {

                    count++;
                    newarr[j] = visited;
                }
            }

            if (newarr[i] != visited)
                newarr[i] = count;
        }
        System.out.println("****************************");
        System.out.println("Element    |    Frequency");
        System.out.println("**************************");

        for(int i = 0; i <newarr.length; i++)
        {
            if(newarr[i] != visited)
            {
                System.out.println(" " + arr[i] + " | " + newarr[i]);
            }

        }
        System.out.println("****************************");
    }
}


import java.util.Arrays;

public class KSmallestStream {
    public static void main(String[] args) {
        int[] arr = {65, 23, 83, 0, 19, 11, 18, 17, 0, 5, 2, 20};
        int k = 3;

        int[] smallest = Arrays.stream(arr).sorted().limit(k).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(smallest));

    }

    
}

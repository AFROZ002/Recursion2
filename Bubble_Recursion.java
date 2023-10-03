import java.util.Arrays;

public class Bubble_Recursion {
    public static void Bubble(int[] arr, int len, int i) {
        if (len == 0) {
            return;
        }
        if (i < len) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            Bubble(arr, len, i + 1);
        }

        else {
            Bubble(arr, len - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}

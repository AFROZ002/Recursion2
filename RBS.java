public class RBS {
    static int RA(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return RA(arr, target, s, mid - 1);
            } else {
                return RA(arr, target, mid + 1, e);
            }
        } else {
            if (target >= arr[mid] && target <= arr[e]) {
                return RA(arr, target, mid + 1, e);
            } else {
                return RA(arr, target, s, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9, 12, 15, 15};
        int target = 4;
        int result = RA(arr, target, 0, arr.length - 1);

        System.out.println(result);

    }
}

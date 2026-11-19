package lb6;

public class lb6_1 {

    public static int findClosest(int[] a, int target) {
        int n = a.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                return a[mid];
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0) {
            return a[0];
        }
        if (left >= n) {
            return a[n - 1];
        }

        int lDiff = Math.abs(a[right] - target);
        int rDiff = Math.abs(a[left] - target);

        if (lDiff <= rDiff) {
            return a[right];
        } else {
            return a[left];
        }
    }
}

package algorythms.sorting_and_searching;

/**
 * isBadVersion is an api
 */
class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        int left = 0;
        int right = n;

        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (isBadVersion(midpoint)) {
                right = midpoint;
            } else {
                left = midpoint + 1;
            }
        }

        if (left == right && isBadVersion(left)) {
            return;
        }

        return;

    }

    public static boolean isBadVersion(int input) {
        return true;
    }

}
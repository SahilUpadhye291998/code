package algorythms.sorting_and_searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = new int[] { -1, 0, 3, 5, 9, 12 };

        int left = 0;
        int right = input.length - 1;

        int key = 9;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            System.out.println(mid);

            if (input[mid] == key) {
                System.out.println(mid);
                return;
            } else if (input[mid] < key) {
                left = mid + 1;
            } else if (input[mid] > key) {
                right = mid - 1;
            }
        }

        System.out.println("No element found");

    }

}
package algorythms.sorting_and_searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 3, 5, 6 };
        int val = 2;
        int low = 0;
        int high = input.length - 1;
        int mid = low + ((high - low) / 2);
        while (low <= high) {
            mid = low + ((high - low) / 2);
            System.out.println(mid);
            if (input[mid] == val) {
                System.out.println("Value found " + mid);
                break;
            } else if (input[mid] > val) {
                high = mid -1;
            } else if (input[mid] < val) {
                low = mid +1;
            }
        }
        System.out.println(mid);

    }
}
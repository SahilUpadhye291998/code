package algorythms.sorting_and_searching;

class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = new int[] { 2, 0 };
        int[] array2 = new int[] { 1 };
        int m = 1;
        int n = 1;
        m--;
        n--;
        int index = array1.length - 1;

        while (index >= 0) {
            if (m < 0) {
                array1[index] = array2[n--];
            } else if (n < 0) {
                array1[index] = array1[m--];
            } else {
                if (array1[m] > array2[n]) {
                    array1[index] = array1[m--];
                } else {
                    array1[index] = array2[n--];
                }
            }
            index--;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
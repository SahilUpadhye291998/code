package algorythms.sorting_and_searching;

class BinarySearchRotatedArray{
    public static void main(String[] args) {
        int[] input = new int[]{1,3};
        int key = 3;
        int left = 0;
        int right = input.length-1;
        int mid = 0;
        while(left<right){
            mid = left + ((right-left)/2);
            if(input[mid]>input[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = input.length - 1;

        if(key >= input[start] && key <= input[start] ){
            left = start;
        }else{
            right = start;
        }
        mid = 0;
        while(left <= right){

            mid = left + ((right-left)/2);
            if(input[mid] == key){
                System.out.println("key found at "+mid);
                return;
            }else if(input[mid]<key){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }

        System.out.println("No element found");

    }

}
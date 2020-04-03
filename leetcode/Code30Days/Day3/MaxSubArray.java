package leetcode.Code30Days.Day3;

class MaxSubArray{
    public static void main(String[] args){
        int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = input[0];
        int currentSum = input[0];

        for(int i=1;i<input.length;i++){
            currentSum = Math.max(input[i]+currentSum,input[i]);
            maxSum = Math.max(currentSum,maxSum);
        }

        System.out.println(maxSum);


    }

}

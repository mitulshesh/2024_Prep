package Arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = { -1};
        System.out.println(findMaxArraySum(arr));

    }

    private static int findMaxArraySum(int[] arr){

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];
            max = Integer.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;

    }
}

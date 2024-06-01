package SlidingWindowTwoPointer;

//Find the largest sum of window size 4
public class LargestSum {


    private static int findLargestSum(int arr[],int windowSize){

        int sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            sum = sum + arr[i];

        }

        return sum;
    }


    public static void main(String[] args) {
        int arr[] = { -1,2,3,3,4,5,1};
        System.out.println(findLargestSum(arr,4));
    }
}

package SlidingWindowTwoPointer;

//given its binary array
/*

Explanation - count number of subarrays with sum < = k and then subtract it with number of subarrays with sum < = k- 1

 */

// Not working
public class CountSubarraysWithSumk {

    public static void main(String[] args) {
        int arr[] = { 0,1,1,1,1};
        int goal = 3;
        System.out.println(logic(arr,goal));
        //System.out.println(logic(arr,goal) - logic(arr,goal-1));
    }

    public static int logic(int[] arr,int goal){


        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;

        if(goal < 0){
            return 0;
        }

        while(r < arr.length){

            sum+=arr[r];

            if(sum <= goal){
                count = count + (r - l + 1);
            }

            while(sum > goal){
                sum = sum - arr[l];
                l++;
            }

            r++;
        }
        return count;
    }
}

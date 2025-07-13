package Arrays;

/*
    Input arr[] = [1,6,3,5,2]
    Output = 4
 */

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println(findMissingNum(arr));
    }

    public static int findMissingNum(int[] arr){

        if(arr == null || arr.length ==0){
            return -1;
        }

        int n = arr.length+1;

        int sum = (n*(n+1))/2;

        int sum2 = 0;

        for(int i = 0;i<arr.length;i++){
            sum2 += arr[i];
        }

        return sum -sum2;

    }
}

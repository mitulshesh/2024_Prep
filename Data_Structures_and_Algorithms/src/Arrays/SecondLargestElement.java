package Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int arr[] = {4,9,8,5,4,10};
        System.out.println(findSecondLargestElement(arr));
        System.out.println(findSecondSmallestElement(arr));
    }

    public static int findSecondLargestElement(int[] arr)
    {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int findSecondSmallestElement(int[] arr){

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){

            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] <secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}

package Sorting;

//not working
public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    private static void quickSort(int[] arr,int low,int high){

        if(low <  high){ // which means we have more than 1 element

            int partitionIndex = computePartitionIndex(arr,low,high);

            //Sort left half
            quickSort(arr,low,partitionIndex-1);
            //Sort right half
            quickSort(arr,partitionIndex+1,high);
        }
    }

    private static int computePartitionIndex(int[] arr, int low, int high){

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){


            while(arr[i] <= pivot && i <= high-1){
                i++;
            }

            while(arr[j]>pivot && j >= low+1){
                j--;
            }

            //while we are here, we have 2 elements to swap
            if(i < j){
                swap(arr,i,j);
            }
        }

        //now while we are here i and j have crossed each other
        swap(arr,low,j);

        return j;
    }

    private static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x]= arr[y];
        arr[y] = tmp;
    }
}

package Recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {3,6,9,12,22,30,38};
        int target =6;
        int searchIndex = BS(arr,target,0,arr.length-1);
        System.out.println(searchIndex);
    }

    public static int BS(int arr[], int target, int s, int e){

        if(s>e){
            System.out.println("Not Found");
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(target < arr[mid]){
            return BS(arr,target,s,mid-1);
        }else{
            return BS(arr,target,mid+1, e);
        }
    }
}

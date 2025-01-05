package Recursion;


import java.util.Arrays;

public class ReverseAnArray {

    private static void reverseArray(int[] arr, int left, int right){

        if(left >=right){
            return;
        }
        swap(arr,left,right);
        reverseArrayWithoutRecursion(arr,left+1,right-1);
    }


    private static void reverseArrayWithoutRecursion(int[] arr,int left, int right){

        while( left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //reverseArrayWithoutRecursion(arr,0,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed Array is ::::");
        System.out.println(Arrays.toString(arr));
    }
}

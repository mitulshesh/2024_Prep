package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,26,7,45,98,65};
        bubbleSort(arr,6);  
    }

    public static void  bubbleSort(int[] arr,int n){

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr.length>1 && arr[j+1] < arr[j]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("After Sorting printing array:::");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }


    }
}

package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={13, 46, 24, 52, 20, 9};
        selSort(arr);
    }

    public static void selSort(int[] arr){

        for(int i = 0;i<=arr.length-2;i++){

            int mini = i;

            for(int j = i+1;j<=arr.length-1;j++){

                if(arr[j] < arr[mini]){
                    mini = j;
                }

                //swap
                int tmp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = tmp;
            }
        }

        System.out.println("Printing sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}

package Arrays;

import Utilities.Utils;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1,};
        //moveNaive(arr);
        moveOptimal(arr);
        //Print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void moveNaive(int[] arr){
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<arr.length;i++) {
            if (arr[i] != 0) {
                tmp.add(arr[i]);
            }
        }
        //Put non zero elements at the beginning
        for(int i=0;i<tmp.size();i++){
               arr[i] = tmp.get(i);
            }

        //put remaining as zeros
        for(int i=tmp.size(); i<arr.length;i++){
            arr[i] = 0;
        }
    }

    private static void moveOptimal(int[] arr){

        //j will always point to a zero in the array
        int j=-1;

        //this loop will set j to the first zero
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for(int i = j+1;i<arr.length;i++){
            if(arr[i]!=0){
                Utils.swap(arr,i,j);
                j++;
            }
        }
    }
}

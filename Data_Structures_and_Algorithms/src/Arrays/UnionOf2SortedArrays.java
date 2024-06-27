package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOf2SortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {-100,-7, 8,15 };
        int[] arr2 = {-8, -3, 8};
        System.out.println(unionOptimal(arr1,arr2));
    }

    private static List<Integer> unionOptimal(int[] arr1,int[] arr2){

        List<Integer> union = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;

        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                if(!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        if(i < m){
            for(int x = i ;x<m;x++){
                if(!union.contains(arr1[x])) {
                    union.add(arr1[x]);
                }
            }
        }

        if(j < n){
            for(int y = j ;y<n;y++){
                if(!union.contains(arr2[y])) {
                    union.add(arr2[y]);
                }
            }
        }

        return union;
    }
}

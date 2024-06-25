package Arrays;

public class RemoveDupsFromSortedArray {
    public static void main(String[] args) {
            int[] arr = { 1,1,2,2,2,2,3,3,3};
            System.out.println(removeDups(arr));
    }

    //Rrturn the length of unique elements in the array
    private static int removeDups(int[] arr){
        //two pointer
        int i = 0;

        for(int j=i+1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}

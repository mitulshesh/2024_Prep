package Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        System.out.println(getLargestElement(arr));
    }

    public static int getLargestElement(int arr[]){

        if(arr == null || arr.length == 0){
            return -1;
        }
        int largest = arr[0];
        for(int i = 1;i< arr.length-1;i++){
            if(arr[i] >  largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

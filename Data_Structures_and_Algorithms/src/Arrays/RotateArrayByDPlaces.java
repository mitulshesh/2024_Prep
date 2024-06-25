package Arrays;

public class RotateArrayByDPlaces {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d =3;
        //rotateNaive(arr,d);
        rotateOptimal(arr,d);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rotateNaive(int[] arr,int d){
        int n = arr.length;
        d = d % n;

        //create tmp array -------- O(d)
        int[] tmp = new int[d];
        for(int i=0; i<d; i++){
            tmp[i] = arr[i];
        }

        //Shifting ---------------O (N -d)
        for(int i = d;i <n;i++){
            arr[i-d] = arr[i];
        }

        //putting back the tmp array at the last ----- O(d)
        for(int i = n-d;i<n;i++){
            arr[i] = tmp[i - (n-d)];
        }
    }

    private static void rotateOptimal(int[] arr,int d){

        int n = arr.length;
    //Reverse index 0 to d-1
     reverse(arr,0,d-1);


        // Reverse d to n-1
        reverse(arr,d,n-1);



        //Reverse entire array
        reverse(arr,0,n-1);


    }

    private static void reverse(int[] arr,int start,int end){
        while(start <= end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
}

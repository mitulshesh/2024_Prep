package Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1,};
        System.out.println(maxConsecutive1s(arr));
    }

    public static int maxConsecutive1s(int[] arr) {

        int count = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Integer.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}

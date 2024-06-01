package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    static List<Integer> indices = new ArrayList<Integer>();

    public static void main(String[] args) {
        int[] arr = {5, 8, 43, 67, 99, 67, 67, 67};
        System.out.println(searchAllIndex(arr, 670, 0));
        System.out.println(findLastIndex(arr, 670, 0));
    }

    static boolean search(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return false;
        } else if (arr[index] == target) {
            return true;
        } else {
            return search(arr, target, index + 1);
        }
    }

    static int searchIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        } else {
            return searchIndex(arr, target, index + 1);
        }
    }

    static List<Integer> searchAllIndex(int[] arr, int target, int index) {

        //base condition
        if (index == arr.length) {
            return indices;
        }
        if (arr[index] == target) {
            indices.add(index);
        }
        return searchAllIndex(arr, target, index + 1);
    }

    static int lastIndex = -1;

    public static int findLastIndex(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return lastIndex;
        }

        if (arr[index] == target) {
            lastIndex = index;
        }

        return findLastIndex(arr, target, index + 1);

    }
}

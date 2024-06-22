package Hashing;

import java.util.Scanner;

public class HashingNumbers {


    public static void main(String[] args) {

        int n; // total numbers
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        // put it in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //precompute
        //Given that in the array max number is 13
        int[] hash = new int[13];

        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        //fetching
        int q= sc.nextInt();
        while(q--!=0){
            int toSearch = sc.nextInt();

            System.out.println("Number " +toSearch+ " occurs::::"+hash[toSearch]+"times");
        }
    }
}

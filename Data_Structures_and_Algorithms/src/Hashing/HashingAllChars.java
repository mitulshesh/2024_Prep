package Hashing;

import java.util.Scanner;

public class HashingAllChars {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s = sc.next();

        int[] hash =new int[256];

        //pre store
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        //fetching
        int q=sc.nextInt();

        while(q-- !=0){
            char ch = sc.next().charAt(0);
            System.out.println("NUmber of times "+ch+ " appears is "+hash[ch]);
        }
    }
}

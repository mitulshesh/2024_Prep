package Hashing;

import java.util.Scanner;

//Character Hashing
public class HashingLowercaseLetters {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s = sc.next();

        int[] hash = new int[26];

        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();

        char toSearch;
        while(q--!=0){
            toSearch = sc.next().charAt(0);
            System.out.println("NUmber of times "+toSearch+" occurs is "+(hash[toSearch - 'a']));
        }
    }
}

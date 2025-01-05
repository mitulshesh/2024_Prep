package Recursion;

import java.util.Scanner;

public class CheckIfStringisPallidrome {


    public static boolean checkIfStrIsPallindrome(String str,int left,int right){

        //base condition for true scenario
        if(left >= right){
            System.out.println("This is a pallindrome");
            return true;
        }

        //base condition for false scenario
        if(str.charAt(left) != str.charAt(right)){
            System.out.println("FALSE");
            return false;
        }

        return checkIfStrIsPallindrome(str,left+1,right-1);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str = "MADAM";
        checkIfStrIsPallindrome(str,0,str.length()-1);
    }
}

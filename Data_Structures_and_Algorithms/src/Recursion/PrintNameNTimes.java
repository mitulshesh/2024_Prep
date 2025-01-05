package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {

    private static void printName(String name, int count){

        //base condition
        if(count == 0){
            return;
        }

        System.out.println(name);
        printName(name,--count);
    }

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = myScanner.nextLine();

        System.out.println("Enter the times you want to print your name");
        int count = myScanner.nextInt();

        printName(name, count);

    }
}

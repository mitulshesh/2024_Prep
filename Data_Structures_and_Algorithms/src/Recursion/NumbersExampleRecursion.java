package Recursion;

public class NumbersExampleRecursion {


    public static void main(String[] args) {

        print(1);
    }

   static void print(int n){
        //base condition in recursion
        if(n ==5){
            return;
        }

       //body
        System.out.println(n);

        //recursive call
       //tailed recursion
        print(n+1);
   }

}


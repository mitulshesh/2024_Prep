package Patterns;

/*
    pattern as below:
     *
    ***
   *****
  *******



 */




public class Pattern1 {

    public static void main(String[] args) {

        int n = 4;
        for(int i = 0;i < n;i++){

            //space
            for(int j = 0;j < n - i + 1 ; j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            //space
            for(int j = 0;j < n - i + 1 ; j++){
                System.out.print(" ");
            }

            System.out.print("\n");
        }
    }
}

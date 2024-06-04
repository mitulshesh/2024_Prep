package MethodReference;

interface Intrf{
    public int add(int x,int y);
}

public class MethodRefDemo {

    public static int sum(int x, int y){
        return (x+y);
    }

    public void m1(){
        System.out.println("Hey there!!!!");
    }

    public static void main(String[] args) {

        //Conventional way
        Intrf i = (x,y)-> { return (x+y); };
        System.out.println(i.add(10,20));


        //Method reference -- static
        Intrf i2 = MethodRefDemo:: sum;
        System.out.println(i2.add(40,50));

        //Instance type
        MethodRefDemo methodRefDemo=new MethodRefDemo();
        Runnable r = methodRefDemo ::m1;
        r.run();
    }
}

package DefaultMethod;

/*
Below is the illustration of how default methods can help achieve multiple inheritance
 */
interface A {
    default void show(){
        System.out.println("show of interface A");
    }
}

interface B {
    default void show(){
        System.out.println("show of interface B");
    }
}

public class DefaultMethodWithMultipleInheritance implements A,B {

    @Override
    public void show() {
        //A.super.show();
        B.super.show();
    }

    public static void main(String[] args) {
        DefaultMethodWithMultipleInheritance d=new DefaultMethodWithMultipleInheritance();
        d.show();
    }
}

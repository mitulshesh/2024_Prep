package AnonymousInnerClass;


interface Intf1{
    public int add(int a,int b);
    public int sub(int a,int b);
}


public class AnonymousInnClassDemo {

    public static void main(String[] args) {
        Intf1 i1 = new Intf1() {
            @java.lang.Override
            public int add(int a, int b) {
                return a+b;
            }

            @java.lang.Override
            public int sub(int a, int b) {
                return a-b;
            }
        };

        System.out.println(i1.add(4,3));
    }
}

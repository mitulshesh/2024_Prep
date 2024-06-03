package FunctionalInterface;


@FunctionalInterface
public interface TestInterface {

    public int add (int a,int b);

}

class TestClass {
    public static void main(String[] args) {

        TestInterface ti = (a,b)-> (a+b);
        System.out.println(ti.add(4,3));
    }
}

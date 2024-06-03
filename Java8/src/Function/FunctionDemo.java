package Function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,Integer> f1 = i -> {
            return i.length();
        };

        System.out.println(f1.apply("mitul"));
    }
}

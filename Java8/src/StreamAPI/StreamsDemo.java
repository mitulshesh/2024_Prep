package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        int[] a1 = { 20,4,5,1,10,12,60,45};
        System.out.println(Arrays.stream(a1).sorted().min().getAsInt());
        List<Integer> l1 = Arrays.asList(10,15,89,1,4,56);
        System.out.println(l1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()));
    }
}

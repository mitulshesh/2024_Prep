package StringSequenceAndSubsets;

public class Subsets {

    public static void main(String[] args) {

        subset("", "abcdef");
    }

    static void subset(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //two recusion calls.. One to take it. other not to
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

    }
}

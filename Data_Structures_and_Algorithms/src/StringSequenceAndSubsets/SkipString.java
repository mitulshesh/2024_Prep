package StringSequenceAndSubsets;

public class SkipString {

    public static void main(String[] args) {

        //Input String avvapplekd
        skipStr("","apple");
    }

    static void skipStr(String p,String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith("apple")){
            skipStr(p,up.substring(5));
        }else{
            char ch = up.charAt(0);
            skipStr(p+ch,up.substring(1));
        }
    }

}

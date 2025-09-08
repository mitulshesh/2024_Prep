package SetAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> myMap = new HashMap<>();

        String firstPut = myMap.put("name","mitul");
        //if key exists, if will return the existing value
        String secondPut = myMap.put("name","pranali");

        String thirdPut = myMap.put("name","prisha");



        System.out.println("FirstPut::"+firstPut+" secondPut::"+secondPut+" thirdPut::"+thirdPut);
        System.out.println(myMap);

        TreeSet s = new TreeSet();
        s.add("mitul");

        System.out.println("a".compareTo("a"));




    }
}

package ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DefaultCapacityDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //NOte this behaviour is introduced in java 8. Capacity is added only after one element is added to the list. Lazy!!!
        ArrayList arrList=new ArrayList();
        System.out.println("Default Capacity before adding anything:::"+getDefaultCapacity(arrList));
        arrList.add("mitul");
        System.out.println("Default Capacity after adding 1 element:::"+getDefaultCapacity(arrList));
        System.out.println(arrList.hashCode());
    }

    public static int getDefaultCapacity(ArrayList arr) throws NoSuchFieldException, IllegalAccessException {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[])field.get(arr)).length;
    }
}

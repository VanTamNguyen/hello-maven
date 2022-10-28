package whyusegenrics;

import java.util.ArrayList;
import java.util.List;

public class WhyUseGenerics {

    private static List list = new ArrayList();

    public static void main(String[] args) {
        list.add("hello");
        list.add(10);
        list.add(new Object());
        String s = (String) list.get(0);

        List<String> genericList = new ArrayList<>();
        genericList.add("hello");
        String first = genericList.get(0);   // no cast
    }
}

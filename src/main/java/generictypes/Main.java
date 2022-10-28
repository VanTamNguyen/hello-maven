package generictypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // A Simple Box Class
        Box1 genericBox = new Box1();
        genericBox.set(1);
        genericBox.set("abc");

        // Invoking and instantiating generic type
        Box2<Integer> integerBox = new Box2<Integer>();
        integerBox.set(10);


        // The Diamond
        Box2<String> stringBox = new Box2<>();
        stringBox.set("String");

        // Multiple type parameters
        Pair<String, Integer> pair1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  pair2 = new OrderedPair<String, String>("hello", "world");

        // Raw Type
        Box2 rawBox = new Box2();
        List rawList = new ArrayList();

        // Assign generic type to raw type and vice version
        Box2 rawBox2 = new Box2<Integer>();
        Box2<Integer> integerBox2 = new Box2();
    }
}

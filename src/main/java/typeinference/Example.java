package typeinference;

import java.io.Serializable;
import java.util.*;

public class Example {
    static <T> T pick(T a1, T a2) {
        return a2;
    }

    public static void main(String[] args) {
        // Example type inference
        Serializable d = pick("d", new ArrayList<String>());

        // Type Inference and Generic Methods
        List<Box<Integer>> integerBoxes = new ArrayList<>();
        BoxDemo.addBox(10, integerBoxes);
        BoxDemo.addBox(20, integerBoxes);

        // Type Inference and Instantiation of Generic Classes
        Map<String, List<String>> myMap = new HashMap<>();
        Map<String, List<String>> yourMap = new HashMap<>(); // Diamond
        Map<String, List<String>> anotherMap = new HashMap(); // unchecked conversion warning

        // Target Type
        List<String> strings = Collections.emptyList();
    }
}

class BoxDemo {
    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }
}

class Box<U> {
    private U u;

    public void set(U u) {
        this.u = u;
    }
}

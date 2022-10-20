import java.util.ArrayList;
import java.util.Collections;

public class List<S> {
    public static void main(String[] args) {
        String[] namesSingle = new String[]{"Carlos", "Alan", "Jaira"};
        java.util.List<String> names = new ArrayList<>();
        // names.add("Mark");
        // names.add("John");
        // names.add("Ruth");

        for (int i = 0; i < namesSingle.length; i++) names.add(namesSingle[i]);
        // Collections.addAll(names, namesSingle);
        for(String name : names) System.out.println(name);

        boolean result = names.contains("Mark"); // check whether an element in the list
        System.out.println(result);

        ///////////////////////////////////////////

        // ArrayList the cars
        java.util.List<Coche> cars = new ArrayList<>();
        cars.add(new Coche("Toyota", "Dark Blue"));
        for (Coche c : cars) System.out.println(c);


    }
}

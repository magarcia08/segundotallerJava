package claro;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String>  names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        System.out.println(names.size());

        names.add("brais");
        names.add("moure");
        names.add("maria");

        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.get(1));

        names.set(1, "andresito");

        System.out.println(names.get(1));

    }


}

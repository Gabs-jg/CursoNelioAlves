package Seção17.Example8.src.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();

        set.remove("Tablet");
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();

        set.removeIf(x -> x.charAt(2) == 'o');
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();
    }
}

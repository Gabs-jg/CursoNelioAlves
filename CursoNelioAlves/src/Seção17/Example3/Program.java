package Seção17.Example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<Objects>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x;
    }
}

package Seção16.Example3.application;

import Seção16.Example3.devices.ComboDevice;
import Seção16.Example3.devices.ConcretePrinter;
import Seção16.Example3.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        System.out.println();
        ConcreteScanner  s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        p.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}

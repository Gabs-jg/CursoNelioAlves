package Seção16.Example3.devices;

public class ComboDevice extends Device implements Scanner, Printer {
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combro processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combro print: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}

package Seção10;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        //For normal
        for(int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("----------------------------------");

        //For each
        for(String obj:vect) {
            System.out.println(obj);
        }
    }
}

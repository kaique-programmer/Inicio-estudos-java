package application;

import model.entities.ClientHashCodeEquals;

public class Program05 {
    public static void main(String[] args) {
        ClientHashCodeEquals c1 = new ClientHashCodeEquals("oliver", "kaique@gmail.com");
        ClientHashCodeEquals c2 = new ClientHashCodeEquals("oliver", "oliver@gmail.com");

        String s1 = new String("igual");
        String s2 = new String("igual");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(s1.equals(s2));
    }
}

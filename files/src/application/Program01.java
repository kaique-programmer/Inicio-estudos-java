package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program01 {
    public static void main(String[] args) {
        String[] colors = new String[] {"Black", "Blue", "Orange"};

        String path = "/home/kaique/out";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (String color : colors) {
                bw.write(color);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
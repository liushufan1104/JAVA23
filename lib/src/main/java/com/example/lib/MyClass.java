package com.example.lib;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class MyClass {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "Big5" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("Åª¨ú¤å¥ó¤º®e¥X¿ù");
            e.printStackTrace();
        }
    }
}

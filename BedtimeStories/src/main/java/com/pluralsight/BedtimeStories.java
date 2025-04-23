package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        String stories = ("\"Goldilocks\", \"Hansel and Gretel\", \"Mary had a Little Lamb\"");
        System.out.println("Pick a Story: " + stories);

        Scanner input = new Scanner(System.in);
        String story = input.nextLine().toLowerCase().replace(" ", "_");


        try {
            FileInputStream fis = new FileInputStream("src/Data/" + story + ".txt");
            Scanner scanner = new Scanner(fis);

            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            throw new RuntimeException(e);
        }
    }
}

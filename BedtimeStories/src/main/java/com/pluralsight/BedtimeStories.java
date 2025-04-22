package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        String stories = ("\"goldilocks\", \"hansel_and_gretel\", \"mary_had_a_little_lamb\"");
        System.out.println("Pick a Story: " + stories);

        Scanner input = new Scanner(System.in);
        String story = input.nextLine();

        try {
            FileInputStream fis = new FileInputStream("Data/" + story + ".txt");
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

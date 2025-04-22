package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {

           String[] quotes = {
                   "\"What, you egg!\" - William Shakespeare",
                   "\"You miss 100% of the shots you don't take.\" - Wayne Gretzky",
                   "\"Be yourself; everyone else is already taken.\" - Oscar Wilde",
                   "\"It always seems impossible until it's done.\" - Nelson Mandela",
                   "\"The journey of a thousand miles begins with a single step.\" - Lao Tzu",
                   "\"Life is either a daring adventure, or nothing.\" - Helen Keller",
                   "\"What we think, we become.\" - Buddha",
                   "\"If you can dream it, you can do it.\" - Walt Disney",
                   "\"Once you choose hope, anything is possible.\" - Christopher Reeve",
                   "\"Carpe diem.\" - Horace"
           };

           System.out.println("Enter a Number (1-10): ");
           int index = input.nextInt();

           System.out.println(quotes[index - 1]);
       }catch (Exception e) {
           System.out.println("Out of Bounds!");
           e.printStackTrace();
    }

    }
}

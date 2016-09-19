package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataStructure<Listing> struct = new DataStructure<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            int commaIndex = line.indexOf(',');
            String name = line.substring(0, commaIndex).trim();
            int age = Integer.parseInt(line.substring(commaIndex + 1).trim());
            struct.addElt(new Listing(name, age));
        }
        struct.showAllListings();
    }
}

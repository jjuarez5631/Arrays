package com.example.java;

public class Main {

    public static void main(String[] args) {
	// program will create an array of strings for office supplies.
        String[] supplies = {"Paper", "Pens", "Pencils", "Stapler", "Highlighers", "Staples"};

        System.out.println("List of Office Supplies:");
        //for loop to display the content of the array length
        for(int i = 0; i < supplies.length;i++){
            System.out.println(supplies[i]);
        }
        //display the total number of items of the array
        System.out.println("");
        System.out.println("Total Supplies: " + supplies.length);
    }
}

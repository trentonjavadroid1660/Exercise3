package com.company.Greenlee;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    // Trenton Greenlee. 1/22/2020. Exercise3. CSCI 1660 - Android Programming Fundamentals (Java).

    // Importing Scanner input to be able to use user inputs for all data types.
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double value = 0;
        value = output(value);
        
        // Using a while loop to determine if the userInput() value is greater than or equal to -460.
        // Will not execute if 'less than -460'.
        // Will execute if greater than or equal to -460.
        // Calling output() to display the results from celsiusCalculator().
        // Calling upon userInput() again since the previous userInput value was true
        while (value >= -460) {
            output(value);
        }

    }

    // Input Method for user inputting a value for degrees fahrenheit.
    public static double input(double fahrenheitInput) {
        System.out.println("Enter a temperature in fahrenheit(Enter '-461' or lower to end the program): ");
        fahrenheitInput = input.nextDouble();
        if (fahrenheitInput >= -460) {
            return fahrenheitInput;
        } else {
            System.out.println("Exiting Program");
            System.exit(0);
        }
        return fahrenheitInput;
    }

    // Methods.
    // Calculator to determine degrees fahrenheit into degrees celsius.
    public static double celsiusCalculator(double fahrenheit) {
        double fah = input(fahrenheit);
        double celsius = 0;
        celsius = (fah - 32.0) / 1.8;
        return celsius;
    }

    // Output to print out degrees celsius to the user.
    // Using DecimalFormat class to restrict the celsius value to only two decimal places.
    public static double output(double celsiusValue) {
        DecimalFormat celsiusFormat = new DecimalFormat("###.##");
        double celsiusCalculation = (celsiusCalculator(celsiusValue));
        System.out.print("This temperature in Celsius is: " + celsiusFormat.format(celsiusCalculation) + " C°\n\n");
        return celsiusCalculation;
    }
}

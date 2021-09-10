/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function prompts user for weight, gender, total alcohol consumed in ounces, and time since last drink
    // Calculates BAC and prints out BAC as well as if its legal to drive
    public static void main( String[] args )
    {
        int alcConsumed, weight, hours, gender;
        double r, BAC;

        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: ");
        Scanner inputGender = new Scanner(System.in);
        gender = inputGender.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        Scanner inputAlcConsumed = new Scanner(System.in);
        alcConsumed = inputAlcConsumed.nextInt();

        System.out.println("What is your weight, in pounds?");
        Scanner inputWeight = new Scanner(System.in);
        weight = inputWeight.nextInt();

        System.out.println("How many hours since your last drink?");
        Scanner inputHours = new Scanner(System.in);
        hours = inputHours.nextInt();

        if (gender == 1)
        {
            r = 0.73;
        }
        else
        {
            r = 0.66;
        }

        BAC = (alcConsumed * 5.14 / weight * r) - 0.015 * hours;

        System.out.println("Your BAC is " + String.format("%.6f",BAC));

        if (BAC >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}

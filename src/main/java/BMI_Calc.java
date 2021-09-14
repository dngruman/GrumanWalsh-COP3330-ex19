/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;
public class BMI_Calc {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double Weight, Height, Ans;

        System.out.print("Your current weight in pounds: ");
        Weight = user_input.nextDouble();
        System.out.print("Your current height in inches: ");
        Height = user_input.nextDouble();

        Ans = (Weight / (Height * Height)) * 703;
        System.out.println("Your BMI is " +String.format("%.1f",Ans));

        if (Ans>25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        if (Ans>= 18.5){
            System.out.println("You are within the ideal weight range.");
        }
        else{
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}

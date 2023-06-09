package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome to Temperature Converter!\n\n\n\n");
        System.out.println("Please enter a temperature. \nIf you are using Fahrenheit, enter in F.");

        Scanner input = new Scanner(System.in);
        String inputted_temp = input.nextLine();

        double temp = 0;

        if(inputted_temp.toLowerCase().contains("f")){
            //Remove the F

            inputted_temp.replace( "f", "");//Built in method inside of java Strings to replace characters

            //Convert string to double
            temp = Double.parseDouble(inputted_temp);
            //Convert F to C
            System.out.println(temp);
            System.out.println("The temperature is " + Converters.convertFtoC(temp) + "C");
        }
        else{

            //Convert string to double
            temp = Double.parseDouble(inputted_temp);
            //Convert C to F
            System.out.println("The temperature is " + Converters.convertCtoF(temp) + "F");
        }


    }
}

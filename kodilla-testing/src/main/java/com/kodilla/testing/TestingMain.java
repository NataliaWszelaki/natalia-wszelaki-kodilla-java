package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[]args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator(12,19);

        int resultSubtract = calculator.subtractBFromA();
        System.out.println("Subtract b from a = " + resultSubtract);
        if (resultSubtract == 7) {
            System.out.println("Correct result!");
        } else {
            System.out.println("Incorrect result!");
        }

        int resultAdd = calculator.addAToB();
        System.out.println("Add a to b = " + resultAdd);
        if (resultAdd == 31) {
            System.out.println("Correct result!");
        } else {
            System.out.println("Incorrect result!");
        }

    }
}

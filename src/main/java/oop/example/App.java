package oop.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String userInput;

        ArrayList<String> listPass = new ArrayList<String>();

        listPass.add("Hello123");
        listPass.add("PASSWORD");
        listPass.add("abc$123");
        listPass.add("Testing156");

        System.out.printf("What is the password? ");
        userInput = input.nextLine();

        if (listPass.contains(userInput)) {
            System.out.printf("Welcome!\n");
        }
        else   {
            System.out.printf("I don't know you.\n");
        }










    }
}

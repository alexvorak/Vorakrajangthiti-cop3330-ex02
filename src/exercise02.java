/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;

public class exercise02 {

    public static void main(String[] args) {
        System.out.printf("What is the input string? ");
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine();
        int count = 0;
        for(int i=0; i<userinput.length(); i++)
        {
            if(userinput.charAt(i) !=' ')
            {
                count++;}
        }
        System.out.printf(userinput+ " has " + count+ " characters." );
    }

}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want a pizza?");
        System.out.print("Enter 'yes' or 'no': ");

        String str1 = in.nextLine(); //nextLine() - reads the entire entered line

        if("yes".equalsIgnoreCase(str1)) //case-insensitive string checking
        {
            System.out.println("Okay. I'm making pizza.");
            Thread.sleep(5000); //pause the thread for 5 seconds
            System.out.println("Your pizza is ready. Bon appetit!");
        }
        else if ("no".equalsIgnoreCase(str1)){
            System.out.println("Bye!");
        }
        else
            System.out.println("Invilid input!");
    }
}

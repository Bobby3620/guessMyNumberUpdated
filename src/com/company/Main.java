package com.company;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	    //The setup
        boolean ifUserPlaysAgain = true;
        while(ifUserPlaysAgain) {
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Hello! Welcome to my program. I will provide you with a list of 50 people. You must guess which person i'm thinking of. Are you ready?");
            String answer = kbInput.nextLine();
            while (answer != "yes") {
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Great! Lets get started");
                    break;
                } else {
                    System.out.println("You must get ready." + "\n" + "Are you ready?");
                    answer = kbInput.nextLine();
                }


            }
            String names[] = {"Bobby", "Abby", "Megan", "Fabi", "Chris", "Chief", "Bryce", "Ian", "Alex", "Jawn", "Ian", "Sam", "Haley", "Briteny", "Heather", "Jaden",
                    "Leah", "Wyatt", "Kevin", "Rob", "Ellie", "Emily", "Serena", "Steven", "Rocky", "Ella", "Jarret", "Brooke", "Sixnine", "Kayne", "Mac Miller", "Bennet",
                    "Prem", "Mat", "Kyle", "Ben", "XXXTentacion(RIP)", "Drake", "Drew", "Andrew", "Kylie", "Brian", "Embiid", "Simmons", "Reddick", "Mia", "Lilly", "Dave", "Alexa", "Lucy"};
            System.out.println("Here is the list of names: ");
            Arrays.sort(names);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            for (String dName : names) {
                System.out.println(dName);
                try {
                    Thread.sleep(300); //This allows a delay between each name
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }

            //User decides the number -> this decides the index of a certain name
            System.out.println("Enter your favorite number(must be a number between 0-49)");
            int favNum = kbInput.nextInt();
            theNumber userFavNum = new theNumber(favNum);
            int ranNum = userFavNum.ranNum(); //Decides the index of names

            //Time for the user to guess the name
            Scanner kbInput2 = new Scanner(System.in);
            boolean answerFound = true;
            while (answerFound) {
                System.out.println("Please guess a name, A through Z, out of the list");
                String userGuess = kbInput2.nextLine();
                int compare = userGuess.compareToIgnoreCase(names[ranNum]);
                System.out.print("You guessed " + userGuess + ". ");

                //The correct answer
                if (userGuess.equalsIgnoreCase(names[ranNum])) {
                    System.out.println("That is correct!");
                    answerFound = false;
                } else if (compare < 0) {
                    System.out.println("Guess another name, higher in the list");
                } else if (compare > 0) {
                    System.out.println("Guess a another name, lower in the list");
                }
            }

                //When answer is found
                System.out.println("Would you like to play?");
                String ifPlayAgain = kbInput2.nextLine();
                if (ifPlayAgain.equalsIgnoreCase("yes")) {
                    System.out.println("Okay!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                } else if (ifPlayAgain.equalsIgnoreCase("no")) {
                    System.out.println("Okay! Goodbye.");
                    ifUserPlaysAgain = false;
                }
        }

    }
}

package com.company;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	    //The setup
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Hello! Welcome to my program. I will provide you with a list of 50 people. You must guess which person i'm thinking of. Are you ready?");
        String answer = kbInput.nextLine();
        while(answer != "yes"){
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Great! Lets get started");
                break;
            }else{
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
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        for(String dName: names){
            System.out.println(dName);
            try {
                Thread.sleep(10); //Not my code, but needed a delay for the list
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        //User decides the number -> this decides the index of names
        System.out.println("Enter your favorite number(must be a number between 1-50)");
        int favNum = kbInput.nextInt();
        theNumber userFavNum = new theNumber(favNum);
        int ranNum = userFavNum.ranNum(); //Decides the index of names






    }
}

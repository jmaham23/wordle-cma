package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInput f = new FileInput();
        Letters l = new Letters();
        Logic sol = new Logic(f);
        String currentWord= "crane";
        System.out.println();
        System.out.println("Mark green letter with 'g', yellow with 'y', and letters not in word with any other character");
        System.out.println("First Word: ");
        while(true){
            System.out.println(currentWord);
            System.out.println("Solved y/n: ");
            String response = input.nextLine();
            if(response.equals("y") || response.equals("yes") || response.equals("true")){
                break;
            }
            for(int i=0; i<currentWord.length();i++){
                System.out.print("\n" + currentWord.charAt(i)+":");
                String res = input.nextLine();
                if(res.equals("g")){
                    l.setLetter(i, currentWord.charAt(i));
                    System.out.println("Letter: "+ currentWord.charAt(i) + " has been added to valid letter at spot" + i + ".");
                }
                else if(res.equals("y")){
                    l.addLetter(i, currentWord.charAt(i));
                    System.out.println("Letter: "+ currentWord.charAt(i) +" has been added as a vagrant letter.");
                }
                else{
                    l.removeLetter(i, currentWord.charAt(i));
                    System.out.println("Letter: "+ currentWord.charAt(i) + " has been removed from possible letters.");
                }
            }
            sol.solve(l);
            if(sol.getWords().size()>0) {
                currentWord = sol.getWords().get(0);
            }
            else{currentWord="wispy";}
        }
    }
}

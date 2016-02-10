/*Master Mind Game 
CS 205
*/
import java.util.*;
public class Mastermind
{

   public static void main(String[] args) 
   {
       //Select Game Type//
       System.out.println("Welcome to Mastermind!");
       Scanner keyboard = new Scanner(System.in);
       int valid = 0;
       //While loop to make sure input is valid
       while(valid == 0)
       {
           System.out.println("Type 'guess' to play against the computer or 'pick' to select peg position and see if the computer can guess your order.");
           String gameType = keyboard.nextLine();
       
           if(gameType.equals("guess") || gameType.equals("Guess"))
           {
               valid = 1;   
               /*Computer Vs. Person Function goes here*/
           }
       
           else if(gameType.equals("pick") || gameType.equals("Pick"))
           {
               valid = 1;
               /*Person Vs. Computer Function goes here*/
           }
       
           else
           {
               System.out.println("Invalid command. Try Again.");
           }
       
       }
   
   }
}  
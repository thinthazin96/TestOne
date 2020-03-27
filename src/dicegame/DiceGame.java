/*
 * NYCCT
 * These programs are written by CST faculty & students
 * Many have been adapted from the text used in class.
 */
package dicegame;

/**
 *
 * @author cymeher
 */
import java.util.Random;   // Needed for Random class

/**
   Dice game
Write a program that plays a simple dice game between the computer and the user. 
* 
When the program runs, a loop should repeat 10 times. Each iteration of the loop 
should do the following:

Generate a random integer in the range of 1 through 6. This is the value of the computer’s die.
Generate another random integer in the range of 1 through 6. This is the value of the user’s die.
The die with the highest value wins. (In case of a tie, there is no winner for that particular 
roll of the dice.)

As the loop iterates, the program should keep count of the number of times the 
computer wins, and the number of times that the user wins. 

After the loop performs all of its iterations, the program should display 
who was the grand winner, the computer or the user.
*/

public class DiceGame
{
   public static void main(String[] args)
   {
      // Variables
      int compValue = 0;   // To hold the computer's dice value
      int userValue = 0;   // To hold the user's dice value
      int compGames = 0;   // To hold the number of games won by the computer
      int userGames = 0;   // To hold the number of games won by the user
      int tiedGames = 0;   // To hold the number of tied games
      
      // Create a Random object.
      Random randValue = new Random();

      // Play ten rounds of the dice game.
      for (int round = 1; round <= 10; round++)
      {

         // Generate a random number between 1 and 6,
         // and assign it to the computer's dice value.
         compValue = randValue.nextInt(6) + 1;
         
         // Generate a random number between 1 and 6,
         // and assign it to the user's dice value.
         userValue = randValue.nextInt(6) + 1;
         
         // Determine the winner of this round.
         if (compValue != userValue)
         {
            if (compValue > userValue)
               // The computer wins this round.
               compGames++;
            else
               // The user wins this round.
               userGames++;
         }
         else
            // This round has ended in a tie.
            tiedGames++;
      }
      
      // Display the results.
      System.out.println("Computer...." + compGames);
      System.out.println("User........" + userGames);
      System.out.println("Ties........" + tiedGames);
      
      // Determine the grand winner.
      if (compGames > userGames)
         // The computer won the most games.
         System.out.println("The computer is the grand winner!");
      else if (compGames < userGames)
         // The user won the most games.
         System.out.println("The user is the grand winner!");
      else
         // The game was a tie.
         System.out.println("The game has ended in a tie!");
   }
}
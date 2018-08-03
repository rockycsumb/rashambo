package rashambo;

import java.util.Scanner;
import java.util.Random;

public class GamePlay
{
   
   private String [] choice = {"rock", "paper", "scissor"};
   private int userScore = 0;
   private int compScore = 0;
   private String userChoice;
   private String compChoice;
   private String winner;
   private boolean userWon = false;
   private boolean compWon = false;
   
   
   public void whoWon()
   {
      userWon = false;
      compWon = false;
      
      if (userChoice.equals("rock") && compChoice.equals("scissors"))
      {
         winner = "user";
         userWon = true;
      }
      else if (userChoice.equals("scissors") && compChoice.equals("paper"))
      {
         winner = "user";
         userWon = true;
      }
      else if (userChoice.equals("paper") && compChoice.equals("rock"))
      {
         winner = "user";
         userWon = true;
      }
      else if (userChoice.equals(compChoice))
      {
         winner = "tie";
         compWon = false;
         userWon = false;
      }
      else
      {
         winner = "computer";
         compWon = true;
      }
      
      incrementWinner();

   }
   
   public void incrementWinner()
   {
      if (userWon == true)
      {
         userScore++;
      }
      else if (compWon == true)
      {
         compScore++;
      }
      
   }

   public String getWinner()
   {
      return winner;
   }
   
   public void setUserChoice(String userChoice)
   {
      this.userChoice = userChoice;
   }
   
   
   public int getUserScore()
   {
      return userScore;
   }
   
   public void setCompChoice(String compChoice)
   {
      this.compChoice = compChoice;
   }
   
   public String getCompChoice()
   {
      return compChoice;
   }
   
   public int getCompScore()
   {
      return compScore;
   }
   
   public String getUserChoice()
   {
      return userChoice;
   }
   
   
   
   public void printScores()
   {
      System.out.println("SCORES: ");
      System.out.println("User: " + getUserScore());
      System.out.println("Computer: " + getCompScore());
   }
   
   public static void main(String[] args)
   {
      GamePlay myGame = new GamePlay();
      Scanner kbd = new Scanner(System.in);
      boolean keepGoing = true;
      String keepPlaying;
      //Random compRandChoice = new Random();
      
      /*
       * import java.util.Random;

Random rand = new Random();

int  n = rand.nextInt(50) + 1;
       * 
       
       */
      
      while (keepGoing)
      {
         System.out.println("make a choice, rock, paper, scissors");
         myGame.setUserChoice(kbd.nextLine());
         
         
         myGame.setCompChoice("rock");

         
         myGame.whoWon();
         
         System.out.println("The winner is: " + myGame.getWinner());
         myGame.printScores();
         
         
         
         
         
         //  TESTING TO KEEP GAME GOING
         System.out.println("Play again? " );
         keepPlaying = kbd.nextLine();
         keepGoing = Boolean.parseBoolean(keepPlaying);
         
      }
      
      
   }
}


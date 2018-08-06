package rashambo;

import java.util.Scanner;
import java.util.Random;
import java.awt.Font;
import javax.swing.ImageIcon;

public class GamePlay
{
   
   public static String [] choice = {"rock", "paper", "scissors"};
   private int userScore = 0;
   private int compScore = 0;
   private String userChoice;
   private String compChoice;
   private String winner;
   private boolean userWon = false;
   private boolean compWon = false;
   GuiRashambo setComputerChoice;
   static ImageIcon[] compImages = new ImageIcon[3];
   
   
   
   public void whoWon()
   {
      userWon = false;
      compWon = false;
      
      if (userChoice.equals("rock") && compChoice.equals("scissors"))
      {
         winner = "YOU WIN";
         userWon = true;
      }
      else if (userChoice.equals("scissors") && compChoice.equals("paper"))
      {
         winner = "YOU WIN";
         userWon = true;
      }
      else if (userChoice.equals("paper") && compChoice.equals("rock"))
      {
         winner = "YOU WIN";
         userWon = true;
      }
      else if (userChoice.equals(compChoice))
      {
         winner = "ITS A TIE!";
         compWon = false;
         userWon = false;
      }
      else
      {
         winner = "YOU LOSE";
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
   
   
   public static void loadComputerChoices()
   {
      compImages[0] = new ImageIcon("images/compRock.png");
      compImages[1] = new ImageIcon("images/compPaper.png");
      compImages[2] = new ImageIcon("images/compScissors.png");
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
   
   public static String computerChoice()
   {
      Random rand = new Random();
      int number = rand.nextInt(3) + 0;
      
      GamePlay.loadComputerChoices();
      
      
      
      System.out.println("" + number);
      GuiRashambo.playAreaRight.setIcon(compImages[number]);
      
      return choice[number];
   }
   
   
}


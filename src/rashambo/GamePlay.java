package rashambo;

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
   
   
   public void whoWon(String userChoice, String compChoice)
   {
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
      else
         winner = "computer";
         compWon = true;     
   }
   
   public void incrementWinner()
   {
      if (userWon == true)
      {
         userScore++;
      }
      else
         compScore++;
   }

   public String getWinner()
   {
      return winner;
   }
   public static void main(String[] args)
   {
      GamePlay myGame = new GamePlay();
      myGame.whoWon("rock", "scissors");
      System.out.println("from main " + myGame.getWinner());
     // System.out.println(");
      
   }
}
   /*
    * String or Integer [] choice = rock, paper, scissor

int userScore = 0;

int compScore = 0;
string whoWins(userChoice, compChoice)

if user = paper and computer = rock

User wins

If user = rock and computer = scissors

user wins

if user = scissors and computer = paper

user wins

Return User

 

All else computer wins

Return computer
    */


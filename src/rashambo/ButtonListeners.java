package rashambo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class ButtonListeners implements ActionListener
{
   
   // GAME PLAY OBJECT
   public GamePlay myGame = new GamePlay();
   
   // BUTTON LISTENER
   public void actionPerformed(ActionEvent e)
   {
      String compChoice = GamePlay.computerChoice();
      String actionCommand = e.getActionCommand();
      
      //MUTATE GAME VARIABLES WITH CHOICES FROM USER AND COMPUTER
      myGame.setUserChoice(actionCommand);
      myGame.setCompChoice(compChoice);
      myGame.whoWon();
      
      
      // SETS SCORE AREA
      GuiRashambo.compScoreLabel.setText(String.valueOf(myGame.getCompScore()));
      GuiRashambo.userScoreLabel.setText(String.valueOf(myGame.getUserScore()));
      GuiRashambo.whoWinsLabel.setText(myGame.getWinner());
      
      // TESTING
      //System.out.println(" user choice " + actionCommand + " computer choice " + compChoice);
      //System.out.println(" who won " + myGame.getWinner());
      //System.out.println("user Score: " + myGame.getUserScore() + " computer score: " + myGame.getCompScore()); 
   }
}

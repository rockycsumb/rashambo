package rashambo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class ButtonListeners implements ActionListener
{
   
   GamePlay myGame = new GamePlay();
   
   public void actionPerformed(ActionEvent e)
   {
      String compChoice = GamePlay.computerChoice();
      
   
      String actionCommand = e.getActionCommand();
      
      myGame.setUserChoice(actionCommand);
      myGame.setCompChoice(compChoice);
      myGame.whoWon();
      
      String test = myGame.getWinner();
      
      GuiRashambo.compScoreLabel.setText(String.valueOf(myGame.getCompScore()));
      GuiRashambo.userScoreLabel.setText(String.valueOf(myGame.getUserScore()));
      GuiRashambo.whoWinsLabel.setText(test);
      System.out.println(" user choice " + actionCommand + " computer choice " + compChoice);
      System.out.println(" who won " + myGame.getWinner());
      System.out.println("user Score: " + myGame.getUserScore() + " computer score: " + myGame.getCompScore());
     
   }
   

}

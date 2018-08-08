package rashambo;

import java.util.Scanner;

public class RashamboMain
{
   //CALLS ROSHAMBO GAME AND MULTITHREAD
   public static void main(String[] args)
   {
      GuiRashambo playGame = new GuiRashambo();
      playGame.setVisible(true);
      MultiThread titleAnimation = new MultiThread();      
   }
}

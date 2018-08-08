package rashambo;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MultiThread extends JFrame implements Runnable
{
   // ATTRIBUTES
   public ImageIcon[] titleAnimation = new ImageIcon[4];
   public int index = 0;
   public static int PAUSE = 1000;
   
   
   //CONSTRUCTOR
   public MultiThread()
   {
      startThread();
   }
   
   //START THREAD METHOD
   public void startThread()
   {
      Thread theThread = new Thread((Runnable) this);
      theThread.start();
   }
   
   //RUN METHOD
   public void run()
   {
      titleAnimation[0] = new ImageIcon("images/blankTitle.png");
      titleAnimation[1] = new ImageIcon("images/roTitle.png");
      titleAnimation[2] = new ImageIcon("images/roshamTitle.png");
      titleAnimation[3] = new ImageIcon("images/roshamboTitle.png");
      
      while(index < 4)
      {
         GuiRashambo.titleColumnLabel.setIcon(titleAnimation[index]);
         //System.out.println("index " + index);
         if (index < 3)
         {
            index++;
         }
         else
         {
            index = 0;
         }
         doNothing(PAUSE);
      }    
   }
   
   public void doNothing(int milliseconds)
   {
      try
      {
         Thread.sleep(milliseconds);
      }
      catch(InterruptedException e)
      {
         System.out.println("Error");
         System.exit(0);
      }
   }  
}

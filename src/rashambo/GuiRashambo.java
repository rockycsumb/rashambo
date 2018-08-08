package rashambo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;

public class GuiRashambo extends JFrame
{

   // ATTRIBUTES
   static JLabel whoWinsLabel;
   static JLabel playAreaRight;
   static JLabel compScoreLabel;
   static JLabel userScoreLabel;
   static JLabel titleColumnLabel;
   static ButtonListeners userButtons = new ButtonListeners();
   public Font whoWinsFont = new Font("Arial", Font.BOLD, 32);
   public Font scoreFont = new Font("Arial", Font.BOLD, 24);
   public static ImageIcon titlePic;
   
   // DEFAULT CONSTRUCTOR
   GuiRashambo()
   {
      super("Rashambo"); 
      setSize(480,642);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(3,1));
      
      
      // TITLE AREA OF GUI
      JPanel titleColumnPanel = new JPanel();
      titleColumnLabel = new JLabel();    
      titlePic = new ImageIcon("images/blankTitle.png");
      titleColumnLabel.setIcon(titlePic);
      titleColumnPanel.add(titleColumnLabel);
      add(titleColumnPanel);
      
      
      
      // PLAY AREA COLUMN
      JPanel playAreaColumnPanel = new JPanel();
      playAreaColumnPanel.setLayout(new GridLayout(1,2));
      
      
      // PLAY AREA USER AREA
      JPanel userButtonPanel = new JPanel();
      userButtonPanel.setLayout(new GridLayout(3,1));
      
      JButton userRockButton = new JButton();
      ImageIcon userRockIcon = new ImageIcon("images/userRock.png");
      userRockButton.setIcon(userRockIcon);
      userRockButton.setActionCommand("rock");
      userRockButton.addActionListener(userButtons);
      userButtonPanel.add(userRockButton);
      
      JButton userPaperButton = new JButton();
      ImageIcon userPaperIcon = new ImageIcon("images/userPaper.png");
      userPaperButton.setIcon(userPaperIcon);
      userPaperButton.setActionCommand("paper");
      userPaperButton.addActionListener(userButtons);
      userButtonPanel.add(userPaperButton);
      
      JButton userScissorsButton = new JButton();
      ImageIcon userScissorsIcon = new ImageIcon("images/userScissors.png");
      userScissorsButton.setIcon(userScissorsIcon);
      userScissorsButton.setActionCommand("scissors");
      userScissorsButton.addActionListener(userButtons);
      userButtonPanel.add(userScissorsButton);
      playAreaColumnPanel.add(userButtonPanel);
      
      
      
      
      // COMPUTER CHOICE AREA
      playAreaRight = new JLabel("Play Area right");
      ImageIcon compChoice = new ImageIcon("images/compChoice.png");
      playAreaRight.setIcon(compChoice);
      playAreaColumnPanel.add(playAreaRight);  
      
      // ADD ALL OF PLAY AREA
      add(playAreaColumnPanel);
      
      
      // SCORE AREA
      // YOU WIN OR LOSE AREA
      JPanel scoreColumnPanel = new JPanel();
      scoreColumnPanel.setLayout(new GridLayout(2,1));
      
      whoWinsLabel = new JLabel();
      whoWinsLabel.setFont(whoWinsFont);
      whoWinsLabel.setText("");
      whoWinsLabel.setHorizontalTextPosition(JLabel.CENTER);  
      ImageIcon scoreColumnImageIcon = new ImageIcon("images/youWinLose.png");
      whoWinsLabel.setIcon(scoreColumnImageIcon);
      
      scoreColumnPanel.add(whoWinsLabel);
      
      
      // USER AND COMP SCORE AREA
      
      JPanel userCompPanel = new JPanel();
      userCompPanel.setLayout(new GridLayout(1,2));
      
      // USER SCORE LABEL AREA
      userScoreLabel = new JLabel("user Score");
      userScoreLabel.setFont(scoreFont);
      userScoreLabel.setText("0");
      userScoreLabel.setHorizontalTextPosition(JLabel.CENTER);
      ImageIcon userScoreIcon = new ImageIcon("images/userScore.png");
      userScoreLabel.setIcon(userScoreIcon);
      userCompPanel.add(userScoreLabel);
      
      // COMP SCORE LABEL AREA
      compScoreLabel = new JLabel("Comp Score");
      compScoreLabel.setFont(scoreFont);
      compScoreLabel.setText("0");
      compScoreLabel.setHorizontalTextPosition(JLabel.CENTER);
      ImageIcon compScoreIcon = new ImageIcon("images/compScore.png");
      compScoreLabel.setIcon(compScoreIcon);
      userCompPanel.add(compScoreLabel);
      
      scoreColumnPanel.add(userCompPanel);
     
      add(scoreColumnPanel);
   }   
}

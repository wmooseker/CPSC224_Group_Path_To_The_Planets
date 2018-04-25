import java.awt.*;
import javax.swing.*;

public class Game{
  public Game(JPanel welcomePanel){
	JLabel players = new JLabel("How many players are there? ");
	players.setBounds(50, 100, 200, 30);
    JTextField gameSetup = new JTextField(2);
    gameSetup.setBounds(250,100,100,30);
    gameSetup.setEditable(true);
    welcomePanel.add(gameSetup);
    welcomePanel.add(players);
    int numberOfPlayers = Integer.parseInt(gameSetup.getText());
    players.setVisible(false);
    gameSetup.setVisible(false);
  }

  public void playGame(){

  }

  /* private scoreGame(){
    ScoreCard scoreCard = new ScoreCard();
  } */
}
package RacingGame;

import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj=new JFrame();
		GamePLay gameplay= new GamePLay();
		obj.setBounds(10, 20, 700, 600);
	    obj.setTitle("Breakout Ball");
	    obj.setResizable(false);
	    obj.setVisible(true);
	    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    obj.add(gameplay);

	}

}

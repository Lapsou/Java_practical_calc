package Calculator;


import javax.swing.*;
import java.awt.*;



class AllColor{
	static public Color MainColor = new Color(0xcafafc);
}

// Java Swing : JFrame <----- Frame
public class Graph {
	public static void main() {
		JFrame calc = new JFrame("Calculator");

		JPanel pnl = new JPanel();

		calc.getContentPane().setBackground(AllColor.MainColor);
		pnl.setBackground(AllColor.MainColor);
		pnl.setLayout(new BoxLayout(pnl,BoxLayout.Y_AXIS));


		calc.setSize(400,400);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnl.add(new JButton("+"));
		pnl.add(new JButton("-"));
		pnl.add(new JButton("*"));
		pnl.add(new JButton("/"));


		calc.getContentPane().add(BorderLayout.EAST,pnl);

		calc.setVisible(true);
	}
}




package Calculator;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.stream.Collectors;


class AllColor{
	static public Color MainColor = new Color(0xcafafc);
}


// Java Swing : JFrame <----- Frame
public class Graph {
	public static void main() {
		JFrame calc = new JFrame("Calculator");

		Box display = Box.createVerticalBox();	// box layout with panale
		display.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));

		JTextArea history_area = new JTextArea();
		JScrollPane history = new JScrollPane(history_area,
												JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
												JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);



		history_area.setRows(10);
		history_area.setEditable(false);
		history.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));

		JTextField equation_display = new JTextField();


		display.add(history);
		display.add(equation_display);



		calc.getContentPane().add(BorderLayout.NORTH,display);

		calc.setSize(400,400);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setVisible(true);
	}
}




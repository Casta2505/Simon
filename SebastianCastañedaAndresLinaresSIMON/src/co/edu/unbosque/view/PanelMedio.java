package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMedio extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b1, b2, b3, b4;
	public static final String B1 = "B1";
	public static final String B2 = "B2";
	public static final String B3 = "B3";
	public static final String B4 = "B4";
	
	public PanelMedio() {
		setLayout( new GridLayout(2,4) );
		b1 = new JButton("1");
		b1.setActionCommand(B1);
		b1.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,100));
		b1.setForeground(Color.black);
		b2 = new JButton("2");
		b2.setActionCommand(B2);
		b2.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,100));
		b2.setForeground(Color.black);
		b3 = new JButton("3");
		b3.setActionCommand(B3);
		b3.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,100));
		b3.setForeground(Color.black);
		b4 = new JButton("4");
		b4.setActionCommand(B4);
		b4.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,100));
		b4.setForeground(Color.black);
		add(new Label());
		add(b1);
		add(b2);
		add(new Label());
		add(new Label());
		add(b3);
		add(b4);
		add(new Label());
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}
	
}

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelFinal extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton terminar;
	public static final String TERMINAR = "Terminar";
	
	public PanelFinal() {
		setLayout( new GridLayout(3,5) );
		terminar = new JButton("Terminar");
		terminar.setActionCommand(TERMINAR);
		terminar.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,16));
		terminar.setForeground(Color.black);
		generar();
		add(terminar);
		generar();
	}
	public void generar() {
		for(int i = 0;i<7;i++) {
			add(new Label());
		}
	}
	public JButton getTerminar() {
		return terminar;
	}
	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}
	
}

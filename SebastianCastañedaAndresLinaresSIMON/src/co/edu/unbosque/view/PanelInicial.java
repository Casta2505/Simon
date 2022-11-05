package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicial extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	private JLabel numero1, numero2, numero3 ,numero4;
	public PanelInicial() {
		setLayout( new GridLayout(3,11) );
		titulo = new JLabel("Numero:");
		titulo.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,18));
		titulo.setForeground(Color.black);
		numero1 = new JLabel();
		numero1.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,20));
		numero1.setForeground(Color.black);
		numero2 = new JLabel();
		numero2.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,20));
		numero2.setForeground(Color.black);
		numero3 = new JLabel();
		numero3.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,20));
		numero3.setForeground(Color.black);
		numero4 = new JLabel();
		numero4.setFont(new Font("Bradley Hand ITC",Font.BOLD+Font.ITALIC,20));
		numero4.setForeground(Color.black);

		generar();
		add(titulo);
		add(new Label());
		add(numero1);
		add(new Label());
		add(numero2);
		add(new Label());
		add(numero3);
		add(new Label());
		add(numero4);
		generar();
	}
	public void generar() {
		for(int i = 0;i<12;i++) {
			add(new Label());
		}
	}
	public JLabel getTitulo() {
		return titulo;
	}
	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	public JLabel getNumero1() {
		return numero1;
	}
	public void setNumero1(JLabel numero1) {
		this.numero1 = numero1;
	}
	public JLabel getNumero2() {
		return numero2;
	}
	public void setNumero2(JLabel numero2) {
		this.numero2 = numero2;
	}
	public JLabel getNumero3() {
		return numero3;
	}
	public void setNumero3(JLabel numero3) {
		this.numero3 = numero3;
	}
	public JLabel getNumero4() {
		return numero4;
	}
	public void setNumero4(JLabel numero4) {
		this.numero4 = numero4;
	}
	
}

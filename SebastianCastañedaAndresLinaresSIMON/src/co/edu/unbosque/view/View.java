package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelInicial pi;
	private PanelMedio pm;
	private PanelFinal pf;
	
	public View(Controller control) {
		setSize(800,600);
		setResizable(false); 
		setTitle("SIMÓN"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout( new BorderLayout() );
		pi = new PanelInicial();
		add(pi,BorderLayout.NORTH);
		pm = new PanelMedio();
		add(pm,BorderLayout.CENTER);
		pf = new PanelFinal();
		add(pf,BorderLayout.SOUTH);
		pm.getB1().addActionListener(control);
		pm.getB2().addActionListener(control);
		pm.getB3().addActionListener(control);
		pm.getB4().addActionListener(control);
		pf.getTerminar().addActionListener(control);
	}
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje,null,JOptionPane.INFORMATION_MESSAGE);
	}
	public void mostrarInformacion2(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje,null,JOptionPane.ERROR_MESSAGE);
	}

	public PanelInicial getPi() {
		return pi;
	}

	public void setPi(PanelInicial pi) {
		this.pi = pi;
	}

	public PanelMedio getPm() {
		return pm;
	}

	public void setPm(PanelMedio pm) {
		this.pm = pm;
	}

	public PanelFinal getPf() {
		return pf;
	}

	public void setPf(PanelFinal pf) {
		this.pf = pf;
	}
	
}

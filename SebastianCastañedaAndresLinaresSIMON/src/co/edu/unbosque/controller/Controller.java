package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	private Juego juego;
	private View vista;
	
	public Controller() {
		juego = new Juego();
		vista = new View(this);
		vista.setVisible(true);
		funcionar();
	}
	public void funcionar() {
		ponerNumeros();
		vista.getPm().setVisible(false);
		vista.getPf().setVisible(false);
		try {
		    Thread.sleep(2 * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
		vista.getPi().setVisible(false);
		vista.getPm().setVisible(true);
		vista.getPf().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(vista.getPf().TERMINAR)){
			comparar();
			vista.getPi().setVisible(true);
		}else if(e.getActionCommand().equals(vista.getPm().B1)) {
			juego.getL().recojerNumeros("1");
		}else if(e.getActionCommand().equals(vista.getPm().B2)) {
			juego.getL().recojerNumeros("2");
		}else if(e.getActionCommand().equals(vista.getPm().B3)) {
			juego.getL().recojerNumeros("3");
		}else if(e.getActionCommand().equals(vista.getPm().B4)) {
			juego.getL().recojerNumeros("4");
		}
		
	}
	public void ponerNumeros() {
		String euno = ""+juego.getL().numerosAleatorios();
		String edos = ""+juego.getL().numerosAleatorios();
		String etres = ""+juego.getL().numerosAleatorios();
		String ecuatro = ""+juego.getL().numerosAleatorios();
		vista.getPi().getNumero1().setText(euno);
		vista.getPi().getNumero2().setText(edos);
		vista.getPi().getNumero3().setText(etres);
		vista.getPi().getNumero4().setText(ecuatro);
		juego.getL().recojerNumerosInicialesA(euno);
		juego.getL().recojerNumerosInicialesA(edos);
		juego.getL().recojerNumerosInicialesA(etres);
		juego.getL().recojerNumerosInicialesA(ecuatro);
	}
	public void comparar() {
        if (juego.getL().getNum().equals(juego.getL().getNumini()) == true) {
            vista.mostrarInformacion("Secuencia Exitosa!");
        }
        else {
        	vista.mostrarInformacion2("Fallaste!");
        }
        System.exit(1);
	}
}


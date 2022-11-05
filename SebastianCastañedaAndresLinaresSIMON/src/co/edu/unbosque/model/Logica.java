package co.edu.unbosque.model;

import java.util.ArrayList;

public class Logica {
	private ArrayList<String> num;
	private ArrayList<String> numini;
	public Logica() {
		num = new ArrayList<>();
		numini = new ArrayList<>();
	}
	public int numerosAleatorios() {
		int a  = (int)(Math.random() * (4)+1);
		return a;
	}
	public void recojerNumeros(String numero) {
		num.add(numero);
	}
	public void recojerNumerosInicialesA(String numero) {
		numini.add(numero);
	}
	public ArrayList<String> getNum() {
		return num;
	}
	public void setNum(ArrayList<String> num) {
		this.num = num;
	}
	public ArrayList<String> getNumini() {
		return numini;
	}
	public void setNumini(ArrayList<String> numini) {
		this.numini = numini;
	}
	
}

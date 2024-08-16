 package view;

import javax.swing.JOptionPane;

import controller.Divisao;

public class Principal {

	public static void main(String[] args) {
		int num;
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog("insira numero"));
		}while (num<0||num>12);
		Divisao div= new Divisao();
		double resp = div.DivFatorada(num);
		System.out.println("Resultado = " + resp);
	}
	
}

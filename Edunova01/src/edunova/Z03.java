package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	//Susjed kopa septičku jamu. Traži tebe da mu osiguraš¡ odvoz zemlje.
	//Napiši program koji za unesene podatke izračunava koliko
	//kubika zemlje treba odvesti.

	public static void main(String[] args) {
		double a, b, c;
		a = Double.parseDouble(JOptionPane.showInputDialog("Unesi dužinu i za decimalni dio stavi ."));
		b = Double.parseDouble(JOptionPane.showInputDialog("Unesi širinu i za decimalni dio stavi ."));
		c = Double.parseDouble(JOptionPane.showInputDialog("Unesi visinu i za decimlani dio stavi ."));
		
		double kubikaža = a * b * c;
		System.out.println(kubikaža);
	}

}

package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	// Program učitava dužinu i širinu prostorije
	// Program ispisuje kvadraturu prostorije
	public static void main(String[] args) {
		double dužina, širina;
		dužina = Double.parseDouble(JOptionPane.showInputDialog("Unesi dužinu i za decimalni dio stavi ."));
		širina = Double.parseDouble(JOptionPane.showInputDialog("Unesi širinu i za decimlani dio stavi ."));
		
		double kvadratura = dužina * širina;
		System.out.println(kvadratura);
				
				
				
	}

}
